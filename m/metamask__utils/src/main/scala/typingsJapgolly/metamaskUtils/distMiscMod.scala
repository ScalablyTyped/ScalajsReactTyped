package typingsJapgolly.metamaskUtils

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMiscMod {
  
  @JSImport("@metamask/utils/dist/misc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@metamask/utils/dist/misc", "ESCAPE_CHARACTERS_REGEXP")
  @js.native
  val ESCAPE_CHARACTERS_REGEXP: js.RegExp = js.native
  
  @js.native
  sealed trait JsonSize extends StObject
  @JSImport("@metamask/utils/dist/misc", "JsonSize")
  @js.native
  object JsonSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JsonSize & Double] = js.native
    
    @js.native
    sealed trait Colon
      extends StObject
         with JsonSize
    /* 1 */ val Colon: typingsJapgolly.metamaskUtils.distMiscMod.JsonSize.Colon & Double = js.native
    
    @js.native
    sealed trait Comma
      extends StObject
         with JsonSize
    /* 1 */ val Comma: typingsJapgolly.metamaskUtils.distMiscMod.JsonSize.Comma & Double = js.native
    
    @js.native
    sealed trait Date
      extends StObject
         with JsonSize
    /* 24 */ val Date: typingsJapgolly.metamaskUtils.distMiscMod.JsonSize.Date & Double = js.native
    
    @js.native
    sealed trait False
      extends StObject
         with JsonSize
    /* 5 */ val False: typingsJapgolly.metamaskUtils.distMiscMod.JsonSize.False & Double = js.native
    
    @js.native
    sealed trait Null
      extends StObject
         with JsonSize
    /* 4 */ val Null: typingsJapgolly.metamaskUtils.distMiscMod.JsonSize.Null & Double = js.native
    
    @js.native
    sealed trait Quote
      extends StObject
         with JsonSize
    /* 1 */ val Quote: typingsJapgolly.metamaskUtils.distMiscMod.JsonSize.Quote & Double = js.native
    
    @js.native
    sealed trait True
      extends StObject
         with JsonSize
    /* 4 */ val True: typingsJapgolly.metamaskUtils.distMiscMod.JsonSize.True & Double = js.native
    
    @js.native
    sealed trait Wrapper
      extends StObject
         with JsonSize
    /* 1 */ val Wrapper: typingsJapgolly.metamaskUtils.distMiscMod.JsonSize.Wrapper & Double = js.native
  }
  
  inline def calculateNumberSize(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateNumberSize")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def calculateStringSize(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateStringSize")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hasProperty(`object`: RuntimeObject, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasProperty(`object`: RuntimeObject, name: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasProperty(`object`: RuntimeObject, name: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isASCII(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isASCII")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNonEmptyArray[Element](value: js.Array[Element]): /* is @metamask/utils.@metamask/utils/dist/misc.NonEmptyArray<Element> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/misc.NonEmptyArray<Element> */ Boolean]
  
  inline def isNullOrUndefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): /* is @metamask/utils.@metamask/utils/dist/misc.RuntimeObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/misc.RuntimeObject */ Boolean]
  
  inline def isPlainObject(value: Any): /* is @metamask/utils.@metamask/utils/dist/misc.PlainObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/misc.PlainObject */ Boolean]
  
  @js.native
  trait Mutable[ObjectValue /* <: Record[String, Any] */, TargetKey /* <: /* keyof ObjectValue */ String */] extends StObject
  
  type NonEmptyArray[Element] = Array[Element]
  
  type PartialOrAbsent[Value] = js.UndefOr[Partial[Value] | Null]
  
  type PlainObject = Record[Double | String | js.Symbol, Any]
  
  type RuntimeObject = Record[Double | String | js.Symbol, Any]
}
