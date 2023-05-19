/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package pagos;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-14")
public class Pago implements org.apache.thrift.TBase<Pago, Pago._Fields>, java.io.Serializable, Cloneable, Comparable<Pago> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Pago");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField FOLIO_FIELD_DESC = new org.apache.thrift.protocol.TField("folio", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TITULAR_FIELD_DESC = new org.apache.thrift.protocol.TField("titular", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CONCEPTO_FIELD_DESC = new org.apache.thrift.protocol.TField("concepto", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CANTIDAD_FIELD_DESC = new org.apache.thrift.protocol.TField("cantidad", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField ESTADO_FIELD_DESC = new org.apache.thrift.protocol.TField("estado", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PagoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PagoTupleSchemeFactory();

  public short id; // required
  public int folio; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String titular; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String concepto; // required
  public double cantidad; // required
  public boolean estado; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    FOLIO((short)2, "folio"),
    TITULAR((short)3, "titular"),
    CONCEPTO((short)4, "concepto"),
    CANTIDAD((short)5, "cantidad"),
    ESTADO((short)6, "estado");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // FOLIO
          return FOLIO;
        case 3: // TITULAR
          return TITULAR;
        case 4: // CONCEPTO
          return CONCEPTO;
        case 5: // CANTIDAD
          return CANTIDAD;
        case 6: // ESTADO
          return ESTADO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __FOLIO_ISSET_ID = 1;
  private static final int __CANTIDAD_ISSET_ID = 2;
  private static final int __ESTADO_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.FOLIO, new org.apache.thrift.meta_data.FieldMetaData("folio", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TITULAR, new org.apache.thrift.meta_data.FieldMetaData("titular", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONCEPTO, new org.apache.thrift.meta_data.FieldMetaData("concepto", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CANTIDAD, new org.apache.thrift.meta_data.FieldMetaData("cantidad", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.ESTADO, new org.apache.thrift.meta_data.FieldMetaData("estado", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Pago.class, metaDataMap);
  }

  public Pago() {
  }

  public Pago(
    short id,
    int folio,
    java.lang.String titular,
    java.lang.String concepto,
    double cantidad,
    boolean estado)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.folio = folio;
    setFolioIsSet(true);
    this.titular = titular;
    this.concepto = concepto;
    this.cantidad = cantidad;
    setCantidadIsSet(true);
    this.estado = estado;
    setEstadoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pago(Pago other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.folio = other.folio;
    if (other.isSetTitular()) {
      this.titular = other.titular;
    }
    if (other.isSetConcepto()) {
      this.concepto = other.concepto;
    }
    this.cantidad = other.cantidad;
    this.estado = other.estado;
  }

  @Override
  public Pago deepCopy() {
    return new Pago(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setFolioIsSet(false);
    this.folio = 0;
    this.titular = null;
    this.concepto = null;
    setCantidadIsSet(false);
    this.cantidad = 0.0;
    setEstadoIsSet(false);
    this.estado = false;
  }

  public short getId() {
    return this.id;
  }

  public Pago setId(short id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int getFolio() {
    return this.folio;
  }

  public Pago setFolio(int folio) {
    this.folio = folio;
    setFolioIsSet(true);
    return this;
  }

  public void unsetFolio() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FOLIO_ISSET_ID);
  }

  /** Returns true if field folio is set (has been assigned a value) and false otherwise */
  public boolean isSetFolio() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FOLIO_ISSET_ID);
  }

  public void setFolioIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FOLIO_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTitular() {
    return this.titular;
  }

  public Pago setTitular(@org.apache.thrift.annotation.Nullable java.lang.String titular) {
    this.titular = titular;
    return this;
  }

  public void unsetTitular() {
    this.titular = null;
  }

  /** Returns true if field titular is set (has been assigned a value) and false otherwise */
  public boolean isSetTitular() {
    return this.titular != null;
  }

  public void setTitularIsSet(boolean value) {
    if (!value) {
      this.titular = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getConcepto() {
    return this.concepto;
  }

  public Pago setConcepto(@org.apache.thrift.annotation.Nullable java.lang.String concepto) {
    this.concepto = concepto;
    return this;
  }

  public void unsetConcepto() {
    this.concepto = null;
  }

  /** Returns true if field concepto is set (has been assigned a value) and false otherwise */
  public boolean isSetConcepto() {
    return this.concepto != null;
  }

  public void setConceptoIsSet(boolean value) {
    if (!value) {
      this.concepto = null;
    }
  }

  public double getCantidad() {
    return this.cantidad;
  }

  public Pago setCantidad(double cantidad) {
    this.cantidad = cantidad;
    setCantidadIsSet(true);
    return this;
  }

  public void unsetCantidad() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CANTIDAD_ISSET_ID);
  }

  /** Returns true if field cantidad is set (has been assigned a value) and false otherwise */
  public boolean isSetCantidad() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CANTIDAD_ISSET_ID);
  }

  public void setCantidadIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CANTIDAD_ISSET_ID, value);
  }

  public boolean isEstado() {
    return this.estado;
  }

  public Pago setEstado(boolean estado) {
    this.estado = estado;
    setEstadoIsSet(true);
    return this;
  }

  public void unsetEstado() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ESTADO_ISSET_ID);
  }

  /** Returns true if field estado is set (has been assigned a value) and false otherwise */
  public boolean isSetEstado() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ESTADO_ISSET_ID);
  }

  public void setEstadoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ESTADO_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Short)value);
      }
      break;

    case FOLIO:
      if (value == null) {
        unsetFolio();
      } else {
        setFolio((java.lang.Integer)value);
      }
      break;

    case TITULAR:
      if (value == null) {
        unsetTitular();
      } else {
        setTitular((java.lang.String)value);
      }
      break;

    case CONCEPTO:
      if (value == null) {
        unsetConcepto();
      } else {
        setConcepto((java.lang.String)value);
      }
      break;

    case CANTIDAD:
      if (value == null) {
        unsetCantidad();
      } else {
        setCantidad((java.lang.Double)value);
      }
      break;

    case ESTADO:
      if (value == null) {
        unsetEstado();
      } else {
        setEstado((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case FOLIO:
      return getFolio();

    case TITULAR:
      return getTitular();

    case CONCEPTO:
      return getConcepto();

    case CANTIDAD:
      return getCantidad();

    case ESTADO:
      return isEstado();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case FOLIO:
      return isSetFolio();
    case TITULAR:
      return isSetTitular();
    case CONCEPTO:
      return isSetConcepto();
    case CANTIDAD:
      return isSetCantidad();
    case ESTADO:
      return isSetEstado();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Pago)
      return this.equals((Pago)that);
    return false;
  }

  public boolean equals(Pago that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_folio = true;
    boolean that_present_folio = true;
    if (this_present_folio || that_present_folio) {
      if (!(this_present_folio && that_present_folio))
        return false;
      if (this.folio != that.folio)
        return false;
    }

    boolean this_present_titular = true && this.isSetTitular();
    boolean that_present_titular = true && that.isSetTitular();
    if (this_present_titular || that_present_titular) {
      if (!(this_present_titular && that_present_titular))
        return false;
      if (!this.titular.equals(that.titular))
        return false;
    }

    boolean this_present_concepto = true && this.isSetConcepto();
    boolean that_present_concepto = true && that.isSetConcepto();
    if (this_present_concepto || that_present_concepto) {
      if (!(this_present_concepto && that_present_concepto))
        return false;
      if (!this.concepto.equals(that.concepto))
        return false;
    }

    boolean this_present_cantidad = true;
    boolean that_present_cantidad = true;
    if (this_present_cantidad || that_present_cantidad) {
      if (!(this_present_cantidad && that_present_cantidad))
        return false;
      if (this.cantidad != that.cantidad)
        return false;
    }

    boolean this_present_estado = true;
    boolean that_present_estado = true;
    if (this_present_estado || that_present_estado) {
      if (!(this_present_estado && that_present_estado))
        return false;
      if (this.estado != that.estado)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + folio;

    hashCode = hashCode * 8191 + ((isSetTitular()) ? 131071 : 524287);
    if (isSetTitular())
      hashCode = hashCode * 8191 + titular.hashCode();

    hashCode = hashCode * 8191 + ((isSetConcepto()) ? 131071 : 524287);
    if (isSetConcepto())
      hashCode = hashCode * 8191 + concepto.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(cantidad);

    hashCode = hashCode * 8191 + ((estado) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(Pago other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFolio(), other.isSetFolio());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFolio()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.folio, other.folio);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTitular(), other.isSetTitular());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitular()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.titular, other.titular);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetConcepto(), other.isSetConcepto());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConcepto()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.concepto, other.concepto);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCantidad(), other.isSetCantidad());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCantidad()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cantidad, other.cantidad);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEstado(), other.isSetEstado());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEstado()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.estado, other.estado);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Pago(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("folio:");
    sb.append(this.folio);
    first = false;
    if (!first) sb.append(", ");
    sb.append("titular:");
    if (this.titular == null) {
      sb.append("null");
    } else {
      sb.append(this.titular);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("concepto:");
    if (this.concepto == null) {
      sb.append("null");
    } else {
      sb.append(this.concepto);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cantidad:");
    sb.append(this.cantidad);
    first = false;
    if (!first) sb.append(", ");
    sb.append("estado:");
    sb.append(this.estado);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PagoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PagoStandardScheme getScheme() {
      return new PagoStandardScheme();
    }
  }

  private static class PagoStandardScheme extends org.apache.thrift.scheme.StandardScheme<Pago> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, Pago struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.id = iprot.readI16();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FOLIO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.folio = iprot.readI32();
              struct.setFolioIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TITULAR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.titular = iprot.readString();
              struct.setTitularIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONCEPTO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.concepto = iprot.readString();
              struct.setConceptoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CANTIDAD
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.cantidad = iprot.readDouble();
              struct.setCantidadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ESTADO
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.estado = iprot.readBool();
              struct.setEstadoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, Pago struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI16(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FOLIO_FIELD_DESC);
      oprot.writeI32(struct.folio);
      oprot.writeFieldEnd();
      if (struct.titular != null) {
        oprot.writeFieldBegin(TITULAR_FIELD_DESC);
        oprot.writeString(struct.titular);
        oprot.writeFieldEnd();
      }
      if (struct.concepto != null) {
        oprot.writeFieldBegin(CONCEPTO_FIELD_DESC);
        oprot.writeString(struct.concepto);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CANTIDAD_FIELD_DESC);
      oprot.writeDouble(struct.cantidad);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ESTADO_FIELD_DESC);
      oprot.writeBool(struct.estado);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PagoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PagoTupleScheme getScheme() {
      return new PagoTupleScheme();
    }
  }

  private static class PagoTupleScheme extends org.apache.thrift.scheme.TupleScheme<Pago> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Pago struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetFolio()) {
        optionals.set(1);
      }
      if (struct.isSetTitular()) {
        optionals.set(2);
      }
      if (struct.isSetConcepto()) {
        optionals.set(3);
      }
      if (struct.isSetCantidad()) {
        optionals.set(4);
      }
      if (struct.isSetEstado()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI16(struct.id);
      }
      if (struct.isSetFolio()) {
        oprot.writeI32(struct.folio);
      }
      if (struct.isSetTitular()) {
        oprot.writeString(struct.titular);
      }
      if (struct.isSetConcepto()) {
        oprot.writeString(struct.concepto);
      }
      if (struct.isSetCantidad()) {
        oprot.writeDouble(struct.cantidad);
      }
      if (struct.isSetEstado()) {
        oprot.writeBool(struct.estado);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Pago struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI16();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.folio = iprot.readI32();
        struct.setFolioIsSet(true);
      }
      if (incoming.get(2)) {
        struct.titular = iprot.readString();
        struct.setTitularIsSet(true);
      }
      if (incoming.get(3)) {
        struct.concepto = iprot.readString();
        struct.setConceptoIsSet(true);
      }
      if (incoming.get(4)) {
        struct.cantidad = iprot.readDouble();
        struct.setCantidadIsSet(true);
      }
      if (incoming.get(5)) {
        struct.estado = iprot.readBool();
        struct.setEstadoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

