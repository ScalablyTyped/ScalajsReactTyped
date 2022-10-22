package typingsJapgolly.wixStyleReact

import typingsJapgolly.wixStyleReact.anon.MaxValue
import typingsJapgolly.wixStyleReact.anon.MinValue
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNumberInputUtilsMod {
  
  @JSImport("wix-style-react/dist/types/NumberInput/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultValueToNullIfEmpty(value: InputValue, defaultValue: InputValue): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultValueToNullIfEmpty")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def defaultValueToNullIfInvalidNumber(value: String): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValueToNullIfInvalidNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  inline def defaultValueToNullIfInvalidNumber(value: Double): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValueToNullIfInvalidNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  
  inline def getErrorMessageByLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessageByLocale")().asInstanceOf[String]
  
  inline def getHasError(hasValueMinValueMaxValue: MaxValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getHasError")(hasValueMinValueMaxValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInRange(hasValueMinValueMaxValue: MinValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInRange")(hasValueMinValueMaxValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
