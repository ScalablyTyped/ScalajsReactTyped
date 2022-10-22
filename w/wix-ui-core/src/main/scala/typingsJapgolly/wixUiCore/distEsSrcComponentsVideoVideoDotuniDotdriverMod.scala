package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsVideoVideoDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/video/Video.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def videoDriverFactory(base: UniDriver[Any]): IVideoDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("videoDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[IVideoDriver]
  
  trait IVideoDriver
    extends StObject
       with BaseUniDriver {
    
    /** returns player name */
    def getPlayerName(): js.Promise[String]
  }
  object IVideoDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getPlayerName: CallbackTo[js.Promise[String]]
    ): IVideoDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getPlayerName = getPlayerName.toJsFn)
      __obj.asInstanceOf[IVideoDriver]
    }
    
    extension [Self <: IVideoDriver](x: Self) {
      
      inline def setGetPlayerName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPlayerName", value.toJsFn)
    }
  }
}
