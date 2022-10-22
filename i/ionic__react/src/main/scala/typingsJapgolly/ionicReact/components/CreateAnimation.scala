package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ionicReact.anon.Dur
import typingsJapgolly.ionicReact.anon.ForceLinearEasing
import typingsJapgolly.ionicReact.anon.Step
import typingsJapgolly.ionicReact.distTypesComponentsCreateAnimationMod.CreateAnimationProps
import typingsJapgolly.ionicReact.distTypesComponentsCreateAnimationMod.PartialPropertyValue
import typingsJapgolly.ionicReact.distTypesComponentsCreateAnimationMod.PropertyValue
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CreateAnimation {
  
  @JSImport("@ionic/react", "CreateAnimation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.ionicReact.mod.CreateAnimation] {
    
    inline def afterAddClass(value: String | js.Array[String]): this.type = set("afterAddClass", value.asInstanceOf[js.Any])
    
    inline def afterAddClassVarargs(value: String*): this.type = set("afterAddClass", js.Array(value*))
    
    inline def afterAddRead(value: Callback): this.type = set("afterAddRead", value.toJsFn)
    
    inline def afterAddWrite(value: Callback): this.type = set("afterAddWrite", value.toJsFn)
    
    inline def afterClearStyles(value: js.Array[String]): this.type = set("afterClearStyles", value.asInstanceOf[js.Any])
    
    inline def afterClearStylesVarargs(value: String*): this.type = set("afterClearStyles", js.Array(value*))
    
    inline def afterRemoveClass(value: String | js.Array[String]): this.type = set("afterRemoveClass", value.asInstanceOf[js.Any])
    
    inline def afterRemoveClassVarargs(value: String*): this.type = set("afterRemoveClass", js.Array(value*))
    
    inline def beforeAddClass(value: String | js.Array[String]): this.type = set("beforeAddClass", value.asInstanceOf[js.Any])
    
    inline def beforeAddClassVarargs(value: String*): this.type = set("beforeAddClass", js.Array(value*))
    
    inline def beforeAddRead(value: Callback): this.type = set("beforeAddRead", value.toJsFn)
    
    inline def beforeAddWrite(value: Callback): this.type = set("beforeAddWrite", value.toJsFn)
    
    inline def beforeClearStyles(value: js.Array[String]): this.type = set("beforeClearStyles", value.asInstanceOf[js.Any])
    
    inline def beforeClearStylesVarargs(value: String*): this.type = set("beforeClearStyles", js.Array(value*))
    
    inline def beforeRemoveClass(value: String | js.Array[String]): this.type = set("beforeRemoveClass", value.asInstanceOf[js.Any])
    
    inline def beforeRemoveClassVarargs(value: String*): this.type = set("beforeRemoveClass", js.Array(value*))
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def destroy(value: Boolean): this.type = set("destroy", value.asInstanceOf[js.Any])
    
    inline def direction(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationDirection */ Any
    ): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
    
    inline def fill(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationFill */ Any
    ): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def from(value: js.Array[PartialPropertyValue] | PartialPropertyValue): this.type = set("from", value.asInstanceOf[js.Any])
    
    inline def fromTo(value: js.Array[PropertyValue] | PropertyValue): this.type = set("fromTo", value.asInstanceOf[js.Any])
    
    inline def fromToVarargs(value: PropertyValue*): this.type = set("fromTo", js.Array(value*))
    
    inline def fromVarargs(value: PartialPropertyValue*): this.type = set("from", js.Array(value*))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def iterations(value: Double): this.type = set("iterations", value.asInstanceOf[js.Any])
    
    inline def keyframes(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationKeyFrames */ Any
    ): this.type = set("keyframes", value.asInstanceOf[js.Any])
    
    inline def onFinish(value: typingsJapgolly.ionicReact.anon.Callback): this.type = set("onFinish", value.asInstanceOf[js.Any])
    
    inline def pause(value: Boolean): this.type = set("pause", value.asInstanceOf[js.Any])
    
    inline def play(value: Boolean): this.type = set("play", value.asInstanceOf[js.Any])
    
    inline def progressEnd(value: Dur): this.type = set("progressEnd", value.asInstanceOf[js.Any])
    
    inline def progressStart(value: ForceLinearEasing): this.type = set("progressStart", value.asInstanceOf[js.Any])
    
    inline def progressStep(value: Step): this.type = set("progressStep", value.asInstanceOf[js.Any])
    
    inline def stop(value: Boolean): this.type = set("stop", value.asInstanceOf[js.Any])
    
    inline def to(value: js.Array[PartialPropertyValue] | PartialPropertyValue): this.type = set("to", value.asInstanceOf[js.Any])
    
    inline def toVarargs(value: PartialPropertyValue*): this.type = set("to", js.Array(value*))
  }
  
  implicit def make(companion: CreateAnimation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[CreateAnimationProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
