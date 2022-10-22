package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.SVGElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRefresherElement
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRefresherRefresherDotutilsMod {
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPullingAnimation(`type`: RefresherAnimationType, pullingSpinner: HTMLElement, refresherEl: HTMLElement): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("createPullingAnimation")(`type`.asInstanceOf[js.Any], pullingSpinner.asInstanceOf[js.Any], refresherEl.asInstanceOf[js.Any])).asInstanceOf[Animation]
  
  inline def createSnapBackAnimation(pullingRefresherIcon: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createSnapBackAnimation")(pullingRefresherIcon.asInstanceOf[js.Any]).asInstanceOf[Animation]
  
  inline def getRefresherAnimationType(contentEl: HTMLElement): RefresherAnimationType = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefresherAnimationType")(contentEl.asInstanceOf[js.Any]).asInstanceOf[RefresherAnimationType]
  
  inline def handleScrollWhilePulling(ticks: NodeList[SVGElement & Node], numTicks: Double, pullAmount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleScrollWhilePulling")(ticks.asInstanceOf[js.Any], numTicks.asInstanceOf[js.Any], pullAmount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def handleScrollWhileRefreshing(spinner: HTMLElement, lastVelocityY: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleScrollWhileRefreshing")(spinner.asInstanceOf[js.Any], lastVelocityY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setSpinnerOpacity(spinner: HTMLElement, opacity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSpinnerOpacity")(spinner.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shouldUseNativeRefresher(referenceEl: HTMLIonRefresherElement, mode: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseNativeRefresher")(referenceEl.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def translateElement(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")().asInstanceOf[js.Promise[Any]]
  inline def translateElement(el: HTMLElement): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def translateElement(el: HTMLElement, value: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def translateElement(el: HTMLElement, value: String, duration: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any], value.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def translateElement(el: HTMLElement, value: Unit, duration: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any], value.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def translateElement(el: Unit, value: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def translateElement(el: Unit, value: String, duration: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any], value.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def translateElement(el: Unit, value: Unit, duration: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any], value.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.scale
    - typingsJapgolly.ionicCore.ionicCoreStrings.translate
  */
  trait RefresherAnimationType extends StObject
  object RefresherAnimationType {
    
    inline def scale: typingsJapgolly.ionicCore.ionicCoreStrings.scale = "scale".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.scale]
    
    inline def translate: typingsJapgolly.ionicCore.ionicCoreStrings.translate = "translate".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.translate]
  }
}
