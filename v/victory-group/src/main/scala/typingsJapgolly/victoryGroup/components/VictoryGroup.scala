package typingsJapgolly.victoryGroup.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryGroup.esVictoryGroupMod.VictoryGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryGroup {
  
  @JSImport("victory-group/es", "VictoryGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def categories(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
    ): this.type = set("categories", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorScale(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
    ): this.type = set("colorScale", value.asInstanceOf[js.Any])
    
    inline def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
    
    inline def domain(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
    ): this.type = set("domain", value.asInstanceOf[js.Any])
    
    inline def domainPadding(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPaddingPropType */ Any
    ): this.type = set("domainPadding", value.asInstanceOf[js.Any])
    
    inline def eventKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
    ): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryGroupTTargetType, StringOrNumberOrCallback> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryGroupTTargetType, StringOrNumberOrCallback> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def style(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
    ): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
