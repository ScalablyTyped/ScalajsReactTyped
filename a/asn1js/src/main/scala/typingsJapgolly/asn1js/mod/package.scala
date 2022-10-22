package typingsJapgolly.asn1js.mod

import typingsJapgolly.asn1js.anon.Instantiable
import typingsJapgolly.asn1js.mod.^
import typingsJapgolly.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Class used as a base block for all remaining ASN.1 classes
  */
inline def HexBlock[T /* <: LocalBaseBlockConstructor[LocalBaseBlock] */](BaseClass: T): Instantiable & T = ^.asInstanceOf[js.Dynamic].applyDynamic("HexBlock")(BaseClass.asInstanceOf[js.Any]).asInstanceOf[Instantiable & T]

/**
  * Compare of two ASN.1 object trees
  * @param root Root of input ASN.1 object tree
  * @param inputData Input ASN.1 object tree
  * @param inputSchema Input ASN.1 schema to compare with
  * @return Returns result of comparison
  */
inline def compareSchema(root: AsnType, inputData: AsnType, inputSchema: AsnSchemaType): CompareSchemaResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSchema")(root.asInstanceOf[js.Any], inputData.asInstanceOf[js.Any], inputSchema.asInstanceOf[js.Any])).asInstanceOf[CompareSchemaResult]

/**
  * Major function for decoding ASN.1 BER array into internal library structures
  * @param inputBuffer ASN.1 BER encoded array of bytes
  */
inline def fromBER(inputBuffer: BufferSource): FromBerResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBER")(inputBuffer.asInstanceOf[js.Any]).asInstanceOf[FromBerResult]

/**
  * ASN.1 schema verification for ArrayBuffer data
  * @param  inputBuffer Input BER-encoded ASN.1 data
  * @param  inputSchema Input ASN.1 schema to verify against to
  * @return
  */
inline def verifySchema(inputBuffer: BufferSource, inputSchema: AsnSchemaType): CompareSchemaResult = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySchema")(inputBuffer.asInstanceOf[js.Any], inputSchema.asInstanceOf[js.Any])).asInstanceOf[CompareSchemaResult]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.asn1js.mod.AsnType
  - typingsJapgolly.asn1js.mod.Any
  - typingsJapgolly.asn1js.mod.Choice
  - typingsJapgolly.asn1js.mod.Repeated
*/
type AsnSchemaType = _AsnSchemaType | (BaseBlock[ValueBlock, ValueBlockJson]) | EndOfContent | Enumerated | Utf8String | TIME | Sequence | Set | NumericString | PrintableString | TeletexString | VideotexString | IA5String | GraphicString | VisibleString | GeneralString | UniversalString | CharacterString | BmpString | DATE | TimeOfDay | DateTime | Duration | Primitive

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.asn1js.mod.BaseBlock[typingsJapgolly.asn1js.mod.ValueBlock, typingsJapgolly.asn1js.mod.ValueBlockJson]
  - typingsJapgolly.asn1js.mod.EndOfContent
  - typingsJapgolly.asn1js.mod.Boolean
  - typingsJapgolly.asn1js.mod.Integer
  - typingsJapgolly.asn1js.mod.BitString
  - typingsJapgolly.asn1js.mod.OctetString
  - typingsJapgolly.asn1js.mod.Null
  - typingsJapgolly.asn1js.mod.ObjectIdentifier
  - typingsJapgolly.asn1js.mod.Enumerated
  - typingsJapgolly.asn1js.mod.Utf8String
  - typingsJapgolly.asn1js.mod.RelativeObjectIdentifier
  - typingsJapgolly.asn1js.mod.TIME
  - typingsJapgolly.asn1js.mod.Sequence
  - typingsJapgolly.asn1js.mod.Set
  - typingsJapgolly.asn1js.mod.NumericString
  - typingsJapgolly.asn1js.mod.PrintableString
  - typingsJapgolly.asn1js.mod.TeletexString
  - typingsJapgolly.asn1js.mod.VideotexString
  - typingsJapgolly.asn1js.mod.IA5String
  - typingsJapgolly.asn1js.mod.UTCTime
  - typingsJapgolly.asn1js.mod.GeneralizedTime
  - typingsJapgolly.asn1js.mod.GraphicString
  - typingsJapgolly.asn1js.mod.VisibleString
  - typingsJapgolly.asn1js.mod.GeneralString
  - typingsJapgolly.asn1js.mod.UniversalString
  - typingsJapgolly.asn1js.mod.CharacterString
  - typingsJapgolly.asn1js.mod.BmpString
  - typingsJapgolly.asn1js.mod.DATE
  - typingsJapgolly.asn1js.mod.TimeOfDay
  - typingsJapgolly.asn1js.mod.DateTime
  - typingsJapgolly.asn1js.mod.Duration
  - typingsJapgolly.asn1js.mod.Constructed
  - typingsJapgolly.asn1js.mod.Primitive
*/
type AsnType = _AsnType | (BaseBlock[ValueBlock, ValueBlockJson]) | EndOfContent | Enumerated | Utf8String | TIME | Sequence | Set | NumericString | PrintableString | TeletexString | VideotexString | IA5String | GraphicString | VisibleString | GeneralString | UniversalString | CharacterString | BmpString | DATE | TimeOfDay | DateTime | Duration | Primitive

type BaseStringBlockJson = LocalStringValueBlockJson

type BitStringJson = BaseBlockJson[LocalBitStringValueBlockJson]

type BmpString = LocalBmpStringValueBlock

type BmpStringJson = LocalBmpStringValueBlockJson

type BmpStringParams = LocalBmpStringValueBlockParams

type BooleanJson = BaseBlockJson[LocalBooleanValueBlockJson]

type CharacterString = LocalSimpleStringBlock

type CharacterStringJson = LocalSimpleStringBlockJson

type CharacterStringParams = LocalSimpleStringBlockParams

type ConstructedItem = (BaseBlock[ValueBlock, ValueBlockJson]) | Any

type ConstructedJson = BaseBlockJson[LocalConstructedValueBlockJson]

type DATE = Utf8String

type DATEParams = Utf8StringParams

type DateTime = Utf8String

type DateTimeParams = Utf8StringParams

type Duration = Utf8String

type DurationParams = Utf8StringParams

type EndOfContent = BaseBlock[LocalEndOfContentValueBlock, ValueBlockJson]

type EndOfContentJson = BaseBlockJson[LocalBaseBlockJson]

type EndOfContentParams = BaseBlockParams

type Enumerated = Integer

type EnumeratedParams = IntegerParams

type GeneralString = LocalSimpleStringBlock

type GeneralStringJson = LocalSimpleStringBlockJson

type GeneralStringParams = LocalSimpleStringBlockParams

type GeneralizedTimeParams = UTCTimeParams

type GraphicString = LocalSimpleStringBlock

type GraphicStringJson = LocalSimpleStringBlockJson

type GraphicStringParams = LocalSimpleStringBlockParams

type IA5String = LocalSimpleStringBlock

type IA5StringJson = LocalSimpleStringBlockJson

type IA5StringParams = LocalSimpleStringBlockParams

type IValueBlock = ILocalBaseBlock

type IntegerJson = BaseBlockJson[LocalIntegerValueBlockJson]

type LocalBmpStringValueBlockJson = LocalSimpleStringBlockJson

type LocalBmpStringValueBlockParams = LocalSimpleStringBlockParams

type LocalSimpleStringBlockJson = LocalSimpleStringValueBlockJson

type LocalSimpleStringValueBlock = LocalStringValueBlock

type LocalSimpleStringValueBlockJson = LocalStringValueBlockJson

type LocalSimpleStringValueBlockParams = LocalStringValueBlockParams

type LocalUniversalStringValueBlockJson = LocalSimpleStringBlockJson

type LocalUniversalStringValueBlockParams = LocalSimpleStringBlockParams

type LocalUtf8StringValueBlockJson = LocalSimpleStringBlockJson

type LocalUtf8StringValueBlockParams = LocalSimpleStringBlockParams

type NullJson = BaseBlockJson[ValueBlockJson]

type NullParams = BaseBlockParams

type NumericString = LocalSimpleStringBlock

type NumericStringJson = LocalSimpleStringBlockJson

type NumericStringParams = LocalSimpleStringBlockParams

type OctetStringJson = BaseBlockJson[LocalOctetStringValueBlockJson]

type Primitive = BaseBlock[LocalPrimitiveValueBlock, LocalPrimitiveValueBlockJson]

type PrimitiveJson = BaseBlockJson[LocalPrimitiveValueBlockJson]

type PrintableString = LocalSimpleStringBlock

type PrintableStringJson = LocalSimpleStringBlockJson

type PrintableStringParams = LocalSimpleStringBlockParams

type Sequence = Constructed

type SequenceParams = ConstructedParams

type Set = Constructed

type SetParams = ConstructedParams

type TIME = Utf8String

type TIMEParams = Utf8StringParams

type TeletexString = LocalSimpleStringBlock

type TeletexStringJson = LocalSimpleStringBlockJson

type TeletexStringParams = LocalSimpleStringBlockParams

type TimeOfDay = Utf8String

type TimeOfDayParams = Utf8StringParams

type UniversalString = LocalUniversalStringValueBlock

type UniversalStringJson = LocalUniversalStringValueBlockJson

type UniversalStringParams = LocalUniversalStringValueBlockParams

type Utf8String = LocalUtf8StringValueBlock

type Utf8StringJson = BaseBlockJson[LocalUtf8StringValueBlockJson]

type ValueBlockJson = LocalBaseBlockJson

type ValueBlockParams = LocalBaseBlockParams

type VideotexString = LocalSimpleStringBlock

type VideotexStringJson = LocalSimpleStringBlockJson

type VideotexStringParams = LocalSimpleStringBlockParams

type VisibleString = LocalSimpleStringBlock

type VisibleStringJson = LocalSimpleStringBlockJson

type VisibleStringParams = LocalSimpleStringBlockParams
