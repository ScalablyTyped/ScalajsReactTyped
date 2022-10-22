package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.ReactPortal
import typingsJapgolly.reactIntl.srcComponentsMessageMod.Props
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedMessage {
  
  @JSImport("react-intl", "FormattedMessage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: /* nodes */ js.Array[Node] => Element | Null): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def ignoreTag(value: Boolean): this.type = set("ignoreTag", value.asInstanceOf[js.Any])
    
    inline def tagName(value: ElementType): this.type = set("tagName", value.asInstanceOf[js.Any])
    
    inline def values(
      value: Record[
          String, 
          js.UndefOr[
            String | Double | Boolean | Element | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[Node, Node]) | Null
          ]
        ]
    ): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FormattedMessage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: Props[
      Record[
        String, 
        js.UndefOr[
          String | Double | Boolean | Element | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[Node, Node]) | Null
        ]
      ]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
