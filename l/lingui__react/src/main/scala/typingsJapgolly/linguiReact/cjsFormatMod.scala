package typingsJapgolly.linguiReact

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsFormatMod {
  
  @JSImport("@lingui/react/cjs/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `formatElements` - parse string and return tree of react elements
    *
    * `value` is string to be formatted with <0>Paired<0/> or <0/> (unpaired)
    * placeholders. `elements` is a array of react elements which indexes
    * correspond to element indexes in formatted string
    */
  inline def formatElements(value: String): String | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatElements")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[Any]]
  inline def formatElements(value: String, elements: StringDictionary[Element]): String | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatElements")(value.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Any]]
}
