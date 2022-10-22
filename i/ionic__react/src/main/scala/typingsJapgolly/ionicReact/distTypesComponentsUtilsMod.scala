package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typingsJapgolly.ionicReact.ionicReactStrings.android
import typingsJapgolly.ionicReact.ionicReactStrings.capacitor
import typingsJapgolly.ionicReact.ionicReactStrings.cordova
import typingsJapgolly.ionicReact.ionicReactStrings.desktop
import typingsJapgolly.ionicReact.ionicReactStrings.electron
import typingsJapgolly.ionicReact.ionicReactStrings.hybrid
import typingsJapgolly.ionicReact.ionicReactStrings.ios
import typingsJapgolly.ionicReact.ionicReactStrings.ipad
import typingsJapgolly.ionicReact.ionicReactStrings.iphone
import typingsJapgolly.ionicReact.ionicReactStrings.mobile
import typingsJapgolly.ionicReact.ionicReactStrings.mobileweb
import typingsJapgolly.ionicReact.ionicReactStrings.phablet
import typingsJapgolly.ionicReact.ionicReactStrings.pwa
import typingsJapgolly.ionicReact.ionicReactStrings.style
import typingsJapgolly.ionicReact.ionicReactStrings.tablet
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsUtilsMod {
  
  @JSImport("@ionic/react/dist/types/components/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createForwardRef[PropType, ElementType](ReactComponent: Any, displayName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createForwardRef")(ReactComponent.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  
  inline def getConfig(): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreConfig */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreConfig */ Any) | Null]
  
  inline def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")().asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  
  inline def isPlatform(
    platform: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Platforms */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlatform")(platform.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type IonicReactExternalProps[PropType, ElementType] = PropType & (Omit[HTMLAttributes[ElementType], style]) & IonicReactProps
}
