package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.TransitionEvent
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationKeyFrames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsAnimationAnimationUtilsMod {
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClassToArray(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("addClassToArray")().asInstanceOf[js.Array[String]]
  inline def addClassToArray(classes: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("addClassToArray")(classes.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def addClassToArray(classes: js.Array[String], className: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassToArray")(classes.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def addClassToArray(classes: js.Array[String], className: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassToArray")(classes.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def addClassToArray(classes: Unit, className: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassToArray")(classes.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def addClassToArray(classes: Unit, className: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassToArray")(classes.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def animationEnd(el: HTMLElement, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("animationEnd")(el.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def animationEnd(el: Null, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("animationEnd")(el.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def createKeyframeStylesheet(keyframeName: String, keyframeRules: String, element: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createKeyframeStylesheet")(keyframeName.asInstanceOf[js.Any], keyframeRules.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def generateKeyframeName(keyframeRules: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyframeName")(keyframeRules.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateKeyframeRules(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyframeRules")().asInstanceOf[String]
  inline def generateKeyframeRules(keyframes: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyframeRules")(keyframes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAnimationPrefix(el: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationPrefix")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStyleContainer(element: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleContainer")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def processKeyframes(keyframes: AnimationKeyFrames): AnimationKeyFrames = ^.asInstanceOf[js.Dynamic].applyDynamic("processKeyframes")(keyframes.asInstanceOf[js.Any]).asInstanceOf[AnimationKeyFrames]
  
  inline def removeStyleProperty(element: HTMLElement, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeStyleProperty")(element.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setStyleProperty(element: HTMLElement, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleProperty")(element.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setStyleProperty(element: HTMLElement, propertyName: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleProperty")(element.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
