package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormatSingularUnit
import typingsJapgolly.reactIntl.libSrcComponentsRelativeMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Relative {
  
  @JSImport("react-intl/lib/src/components/relative", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: /* value */ String => Element | Null): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def unit(value: RelativeTimeFormatSingularUnit): this.type = set("unit", value.asInstanceOf[js.Any])
    
    inline def updateIntervalInSeconds(value: Double): this.type = set("updateIntervalInSeconds", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Relative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
