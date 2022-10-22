package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.AggregateThreshold
import typingsJapgolly.grommet.anon.Browse
import typingsJapgolly.grommet.anon.Files
import typingsJapgolly.grommet.anon.OnCancel
import typingsJapgolly.grommet.anon.Target
import typingsJapgolly.grommet.es6ComponentsFileInputMod.FileInputExtendedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileInput {
  
  @JSImport("grommet/es6", "FileInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def confirmRemove(value: /* hasOnConfirmOnCancel */ OnCancel => Element): this.type = set("confirmRemove", js.Any.fromFunction1(value))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def maxSize(value: Double): this.type = set("maxSize", value.asInstanceOf[js.Any])
    
    inline def messages(value: Browse): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean | AggregateThreshold): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]], /* hasFiles */ js.UndefOr[Files], /* hasTarget */ js.UndefOr[Target]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]], t1: /* hasFiles */ js.UndefOr[Files], t2: /* hasTarget */ js.UndefOr[Target]) => (value(t0, t1, t2)).runNow()))
    
    inline def renderFile(value: /* repeated */ Any => Callback): this.type = set("renderFile", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
  
  implicit def make(companion: FileInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FileInputExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
