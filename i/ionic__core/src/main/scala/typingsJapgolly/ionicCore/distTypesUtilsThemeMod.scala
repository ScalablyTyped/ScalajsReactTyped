package typingsJapgolly.ionicCore

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.CssClassMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsThemeMod {
  
  @JSImport("@ionic/core/dist/types/utils/theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createColorClasses(color: Null, cssClassMap: CssClassMap): CssClassMap = (^.asInstanceOf[js.Dynamic].applyDynamic("createColorClasses")(color.asInstanceOf[js.Any], cssClassMap.asInstanceOf[js.Any])).asInstanceOf[CssClassMap]
  inline def createColorClasses(color: Unit, cssClassMap: CssClassMap): CssClassMap = (^.asInstanceOf[js.Dynamic].applyDynamic("createColorClasses")(color.asInstanceOf[js.Any], cssClassMap.asInstanceOf[js.Any])).asInstanceOf[CssClassMap]
  inline def createColorClasses(color: Color, cssClassMap: CssClassMap): CssClassMap = (^.asInstanceOf[js.Dynamic].applyDynamic("createColorClasses")(color.asInstanceOf[js.Any], cssClassMap.asInstanceOf[js.Any])).asInstanceOf[CssClassMap]
  
  inline def getClassList(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassList")().asInstanceOf[js.Array[String]]
  inline def getClassList(classes: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassList")(classes.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getClassList(classes: js.Array[js.UndefOr[String | Null]]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassList")(classes.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getClassMap(): CssClassMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassMap")().asInstanceOf[CssClassMap]
  inline def getClassMap(classes: String): CssClassMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassMap")(classes.asInstanceOf[js.Any]).asInstanceOf[CssClassMap]
  inline def getClassMap(classes: js.Array[String]): CssClassMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassMap")(classes.asInstanceOf[js.Any]).asInstanceOf[CssClassMap]
  
  inline def hostContext(selector: String, el: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hostContext")(selector.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def openURL(url: String, ev: Event, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: String, ev: Event, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: String, ev: Null, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: String, ev: Null, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: String, ev: Unit, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: String, ev: Unit, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Null, ev: Event, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Null, ev: Event, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Null, ev: Null, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Null, ev: Null, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Null, ev: Unit, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Null, ev: Unit, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Unit, ev: Event, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Unit, ev: Event, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Unit, ev: Null, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Unit, ev: Null, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Unit, ev: Unit, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def openURL(url: Unit, ev: Unit, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
