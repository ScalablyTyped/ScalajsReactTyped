package typingsJapgolly.victoryHistogram.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryHistogram.anon.Bottom
import typingsJapgolly.victoryHistogram.esMod.VictoryHistogramProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryHistogram {
  
  @JSImport("victory-histogram/es", "VictoryHistogram")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryHistogram.esMod.VictoryHistogram] {
    
    inline def binSpacing(value: Double): this.type = set("binSpacing", value.asInstanceOf[js.Any])
    
    inline def bins(value: Double | (js.Array[js.Date | Double])): this.type = set("bins", value.asInstanceOf[js.Any])
    
    inline def binsVarargs(value: (js.Date | Double)*): this.type = set("bins", js.Array(value*))
    
    inline def cornerRadius(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
    ): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    inline def eventKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
    ): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryHistogramTargetType, number | string | Array<number> | Array<string>> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryHistogramTargetType, number | string | Array<number> | Array<string>> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def style(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
    ): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryHistogram.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryHistogramProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
