package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonFooterElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsInputShimsHacksScrollAssistMod {
  
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    contentEl: HTMLElement,
    footerEl: Null,
    keyboardHeight: Double
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollAssist")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], footerEl.asInstanceOf[js.Any], keyboardHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    contentEl: HTMLElement,
    footerEl: HTMLIonFooterElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollAssist")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], footerEl.asInstanceOf[js.Any], keyboardHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    contentEl: Null,
    footerEl: Null,
    keyboardHeight: Double
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollAssist")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], footerEl.asInstanceOf[js.Any], keyboardHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    contentEl: Null,
    footerEl: HTMLIonFooterElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollAssist")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], footerEl.asInstanceOf[js.Any], keyboardHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    contentEl: HTMLElement,
    footerEl: Null,
    keyboardHeight: Double
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollAssist")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], footerEl.asInstanceOf[js.Any], keyboardHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    contentEl: HTMLElement,
    footerEl: HTMLIonFooterElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollAssist")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], footerEl.asInstanceOf[js.Any], keyboardHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    contentEl: Null,
    footerEl: Null,
    keyboardHeight: Double
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollAssist")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], footerEl.asInstanceOf[js.Any], keyboardHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    contentEl: Null,
    footerEl: HTMLIonFooterElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollAssist")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], footerEl.asInstanceOf[js.Any], keyboardHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  trait PointerCoordinates extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object PointerCoordinates {
    
    inline def apply(x: Double, y: Double): PointerCoordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerCoordinates]
    }
    
    extension [Self <: PointerCoordinates](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
