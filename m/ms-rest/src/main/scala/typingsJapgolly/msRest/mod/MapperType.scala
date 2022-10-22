package typingsJapgolly.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapperType extends StObject
@JSImport("ms-rest", "MapperType")
@js.native
object MapperType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapperType & Double] = js.native
  
  @js.native
  sealed trait Base64Url
    extends StObject
       with MapperType
  /* 0 */ val Base64Url: typingsJapgolly.msRest.mod.MapperType.Base64Url & Double = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with MapperType
  /* 1 */ val Boolean: typingsJapgolly.msRest.mod.MapperType.Boolean & Double = js.native
  
  @js.native
  sealed trait ByteArray
    extends StObject
       with MapperType
  /* 2 */ val ByteArray: typingsJapgolly.msRest.mod.MapperType.ByteArray & Double = js.native
  
  @js.native
  sealed trait Composite
    extends StObject
       with MapperType
  /* 3 */ val Composite: typingsJapgolly.msRest.mod.MapperType.Composite & Double = js.native
  
  @js.native
  sealed trait Date
    extends StObject
       with MapperType
  /* 4 */ val Date: typingsJapgolly.msRest.mod.MapperType.Date & Double = js.native
  
  @js.native
  sealed trait DateTime
    extends StObject
       with MapperType
  /* 5 */ val DateTime: typingsJapgolly.msRest.mod.MapperType.DateTime & Double = js.native
  
  @js.native
  sealed trait DateTimeRfc1123
    extends StObject
       with MapperType
  /* 6 */ val DateTimeRfc1123: typingsJapgolly.msRest.mod.MapperType.DateTimeRfc1123 & Double = js.native
  
  @js.native
  sealed trait Dictionary
    extends StObject
       with MapperType
  /* 7 */ val Dictionary: typingsJapgolly.msRest.mod.MapperType.Dictionary & Double = js.native
  
  @js.native
  sealed trait Enum
    extends StObject
       with MapperType
  /* 8 */ val Enum: typingsJapgolly.msRest.mod.MapperType.Enum & Double = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with MapperType
  /* 9 */ val Number: typingsJapgolly.msRest.mod.MapperType.Number & Double = js.native
  
  @js.native
  sealed trait Object
    extends StObject
       with MapperType
  /* 10 */ val Object: typingsJapgolly.msRest.mod.MapperType.Object & Double = js.native
  
  @js.native
  sealed trait Sequence
    extends StObject
       with MapperType
  /* 11 */ val Sequence: typingsJapgolly.msRest.mod.MapperType.Sequence & Double = js.native
  
  @js.native
  sealed trait Stream
    extends StObject
       with MapperType
  /* 13 */ val Stream: typingsJapgolly.msRest.mod.MapperType.Stream & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with MapperType
  /* 12 */ val String: typingsJapgolly.msRest.mod.MapperType.String & Double = js.native
  
  @js.native
  sealed trait TimeSpan
    extends StObject
       with MapperType
  /* 14 */ val TimeSpan: typingsJapgolly.msRest.mod.MapperType.TimeSpan & Double = js.native
  
  @js.native
  sealed trait UnixTime
    extends StObject
       with MapperType
  /* 15 */ val UnixTime: typingsJapgolly.msRest.mod.MapperType.UnixTime & Double = js.native
}
