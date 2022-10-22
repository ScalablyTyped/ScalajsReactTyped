package typingsJapgolly.reactNativePaper

import typingsJapgolly.reactNative.mod.EmitterSubscription
import typingsJapgolly.reactNative.mod.NativeEventSubscription
import typingsJapgolly.reactNativePaper.anon.AddEventListener
import typingsJapgolly.reactNativePaper.anon.AddListener
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptUtilsAddEventListenerMod {
  
  @JSImport("react-native-paper/lib/typescript/utils/addEventListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener[T /* <: AddEventListener */](
    Module: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type Parameters<typeof Module.addEventListener> is not an array type */ rest: Parameters[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Module.addEventListener */ Any
    ]
  ): NativeEventSubscription | EmitterSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(Module.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[NativeEventSubscription | EmitterSubscription]
  
  inline def addListener[T /* <: AddListener */](
    Module: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type Parameters<typeof Module.addListener> is not an array type */ rest: Parameters[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Module.addListener */ Any
    ]
  ): EmitterSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(Module.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[EmitterSubscription]
}
