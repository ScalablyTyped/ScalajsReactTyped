package typingsJapgolly.mobservable

import typingsJapgolly.mobservable.libDnodeMod.ViewNode
import typingsJapgolly.mobservable.libInterfacesMod.IContextInfoStruct
import typingsJapgolly.mobservable.libInterfacesMod.Lambda
import typingsJapgolly.mobservable.libSimpleeventemitterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObservableviewMod {
  
  @JSImport("mobservable/lib/observableview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobservable/lib/observableview", "ObservableView")
  @js.native
  open class ObservableView[T] protected () extends ViewNode {
    def this(func: js.Function0[T], scope: js.Object, context: IContextInfoStruct, compareStructural: Boolean) = this()
    
    /* protected */ var _value: T = js.native
    
    /* protected */ var changeEvent: default = js.native
    
    /* private */ var compareStructural: Any = js.native
    
    /* protected */ def func(): T = js.native
    
    def get(): T = js.native
    
    /* private */ var isComputing: Any = js.native
    
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
    
    /* private */ var scope: Any = js.native
    
    def set(x: Any): Unit = js.native
  }
  
  inline def throwingViewSetter(name: Any): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("throwingViewSetter")(name.asInstanceOf[js.Any]).asInstanceOf[Lambda]
}
