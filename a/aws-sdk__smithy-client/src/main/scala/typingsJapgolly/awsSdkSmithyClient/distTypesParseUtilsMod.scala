package typingsJapgolly.awsSdkSmithyClient

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesParseUtilsMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/parse-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expectBoolean(value: Any): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def expectByte(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectByte")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectFloat32(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectInt(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectInt32(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectInt32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectLong(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectLong")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectNonNull[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")().asInstanceOf[T]
  inline def expectNonNull[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def expectNonNull[T](value: T, location: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")(value.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def expectNonNull[T](value: Null, location: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")(value.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def expectNonNull[T](value: Unit, location: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")(value.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def expectNumber(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectNumber")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectObject(value: Any): js.UndefOr[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectObject")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, Any]]]
  
  inline def expectShort(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectShort")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectString(value: Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectString")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def expectUnion(value: Any): js.UndefOr[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectUnion")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, Any]]]
  
  inline def handleFloat(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def handleFloat(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def limitedParseDouble(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def limitedParseDouble(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def limitedParseFloat(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def limitedParseFloat(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def limitedParseFloat32(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def limitedParseFloat32(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  object logger {
    
    @JSImport("@aws-sdk/smithy-client/dist-types/parse-utils", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def warn(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def warn(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def warn(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  inline def parseBoolean(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def strictParseByte(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseByte")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseByte(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseByte")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseDouble(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseDouble(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseFloat(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseFloat(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseFloat32(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseFloat32(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseInt(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseInt(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseInt32(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseInt32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseInt32(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseInt32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseLong(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseLong")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseLong(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseLong")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseShort(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseShort")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseShort(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseShort")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
}
