package typingsJapgolly.victoryBar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryBar.anon.Bottom
import typingsJapgolly.victoryBar.esMod.VictoryBarAlignmentType
import typingsJapgolly.victoryBar.esMod.VictoryBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryBar {
  
  @JSImport("victory-bar/es", "VictoryBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryBar.esMod.VictoryBar] {
    
    inline def alignment(value: VictoryBarAlignmentType): this.type = set("alignment", value.asInstanceOf[js.Any])
    
    inline def barRatio(value: Double): this.type = set("barRatio", value.asInstanceOf[js.Any])
    
    inline def barWidth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("barWidth", value.asInstanceOf[js.Any])
    
    inline def cornerRadius(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
    ): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    inline def eventKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
    ): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryBarTTargetType, number | string | Array<number> | Array<string>> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryBarTTargetType, number | string | Array<number> | Array<string>> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def style(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
    ): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
