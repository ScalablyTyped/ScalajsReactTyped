package typingsJapgolly.angularUiRouter

import typingsJapgolly.angularUiRouter.anon.Resolve
import typingsJapgolly.angularUiRouter.libDirectivesStateDirectivesMod.ng1Directive
import typingsJapgolly.angularUiRouter.libStatebuildersViewsMod.Ng1ViewConfig
import typingsJapgolly.uirouterCore.libViewInterfaceMod.ActiveUIView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDirectivesViewDirectiveMod {
  
  @JSImport("angular-ui-router/lib/directives/viewDirective", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("angular-ui-router/lib/directives/viewDirective", "uiView")
  @js.native
  def uiView: ng1Directive = js.native
  inline def uiView_=(x: ng1Directive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uiView")(x.asInstanceOf[js.Any])
  
  trait UIViewAnimData extends StObject {
    
    @JSName("$animEnter")
    var $animEnter: js.Promise[Any]
    
    @JSName("$animLeave")
    var $animLeave: js.Promise[Any]
    
    @JSName("$$animLeave")
    var DollarDollaranimLeave: Resolve
  }
  object UIViewAnimData {
    
    inline def apply($animEnter: js.Promise[Any], $animLeave: js.Promise[Any], DollarDollaranimLeave: Resolve): UIViewAnimData = {
      val __obj = js.Dynamic.literal($animEnter = $animEnter.asInstanceOf[js.Any], $animLeave = $animLeave.asInstanceOf[js.Any])
      __obj.updateDynamic("$$animLeave")(DollarDollaranimLeave.asInstanceOf[js.Any])
      __obj.asInstanceOf[UIViewAnimData]
    }
    
    extension [Self <: UIViewAnimData](x: Self) {
      
      inline def set$animEnter(value: js.Promise[Any]): Self = StObject.set(x, "$animEnter", value.asInstanceOf[js.Any])
      
      inline def set$animLeave(value: js.Promise[Any]): Self = StObject.set(x, "$animLeave", value.asInstanceOf[js.Any])
      
      inline def setDollarDollaranimLeave(value: Resolve): Self = StObject.set(x, "$$animLeave", value.asInstanceOf[js.Any])
    }
  }
  
  trait UIViewData extends StObject {
    
    @JSName("$cfg")
    var $cfg: Ng1ViewConfig
    
    @JSName("$uiView")
    var $uiView: ActiveUIView
  }
  object UIViewData {
    
    inline def apply($cfg: Ng1ViewConfig, $uiView: ActiveUIView): UIViewData = {
      val __obj = js.Dynamic.literal($cfg = $cfg.asInstanceOf[js.Any], $uiView = $uiView.asInstanceOf[js.Any])
      __obj.asInstanceOf[UIViewData]
    }
    
    extension [Self <: UIViewData](x: Self) {
      
      inline def set$cfg(value: Ng1ViewConfig): Self = StObject.set(x, "$cfg", value.asInstanceOf[js.Any])
      
      inline def set$uiView(value: ActiveUIView): Self = StObject.set(x, "$uiView", value.asInstanceOf[js.Any])
    }
  }
}
