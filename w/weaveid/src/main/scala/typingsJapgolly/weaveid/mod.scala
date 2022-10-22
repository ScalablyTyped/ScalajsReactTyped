package typingsJapgolly.weaveid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("weaveid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closeLoginModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeLoginModal")().asInstanceOf[Unit]
  
  inline def getAddress(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")().asInstanceOf[js.Promise[String]]
  
  inline def getWallet(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JWKInterface */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWallet")().asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JWKInterface */ Any
  ]]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  
  inline def openLoginModal(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("openLoginModal")().asInstanceOf[js.Promise[String]]
  inline def openLoginModal(e: Event): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("openLoginModal")(e.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  object global {
    
    trait Window extends StObject {
      
      var WeaveID: Any
      
      def closeLoginModal(): Unit
      @JSName("closeLoginModal")
      var closeLoginModal_Original: js.Function0[Unit]
      
      def getAddress(): js.Promise[String]
      @JSName("getAddress")
      var getAddress_Original: js.Function0[js.Promise[String]]
      
      def getWallet(): js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JWKInterface */ Any
          ]
      @JSName("getWallet")
      var getWallet_Original: js.Function0[
            js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JWKInterface */ Any
            ]
          ]
      
      def init(): Unit
      @JSName("init")
      var init_Original: js.Function0[Unit]
      
      def openLoginModal(): js.Promise[String]
      def openLoginModal(e: Event): js.Promise[String]
      @JSName("openLoginModal")
      var openLoginModal_Original: js.Function1[/* e */ js.UndefOr[Event], js.Promise[String]]
    }
    object Window {
      
      inline def apply(
        WeaveID: Any,
        closeLoginModal: Callback,
        getAddress: CallbackTo[js.Promise[String]],
        getWallet: CallbackTo[
              js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JWKInterface */ Any
              ]
            ],
        init: Callback,
        openLoginModal: /* e */ js.UndefOr[Event] => js.Promise[String]
      ): Window = {
        val __obj = js.Dynamic.literal(WeaveID = WeaveID.asInstanceOf[js.Any], closeLoginModal = closeLoginModal.toJsFn, getAddress = getAddress.toJsFn, getWallet = getWallet.toJsFn, init = init.toJsFn, openLoginModal = js.Any.fromFunction1(openLoginModal))
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setCloseLoginModal(value: Callback): Self = StObject.set(x, "closeLoginModal", value.toJsFn)
        
        inline def setGetAddress(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAddress", value.toJsFn)
        
        inline def setGetWallet(
          value: CallbackTo[
                  js.Promise[
                    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JWKInterface */ Any
                  ]
                ]
        ): Self = StObject.set(x, "getWallet", value.toJsFn)
        
        inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
        
        inline def setOpenLoginModal(value: /* e */ js.UndefOr[Event] => js.Promise[String]): Self = StObject.set(x, "openLoginModal", js.Any.fromFunction1(value))
        
        inline def setWeaveID(value: Any): Self = StObject.set(x, "WeaveID", value.asInstanceOf[js.Any])
      }
    }
  }
}
