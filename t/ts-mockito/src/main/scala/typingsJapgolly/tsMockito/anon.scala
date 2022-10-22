package typingsJapgolly.tsMockito

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor1
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor10
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor2
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor3
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor4
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor5
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor6
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor7
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor8
import typingsJapgolly.tsMockito.libCaptureArgCaptorMod.ArgCaptor9
import typingsJapgolly.tsMockito.libMethodStubSetterMod.MethodStubSetter
import typingsJapgolly.tsMockito.libMethodStubVerificatorMod.MethodStubVerificator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T](method: T): MethodStubSetter[T, Unit, js.Error] = js.native
    def apply[T](method: js.Promise[T]): MethodStubSetter[js.Promise[T], T, js.Error] = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply[T0](method: js.Function1[/* a */ T0, Any]): ArgCaptor1[T0] = js.native
    def apply[T0, T1](method: js.Function2[/* a */ T0, /* b */ T1, Any]): ArgCaptor2[T0, T1] = js.native
    def apply[T0, T1, T2](method: js.Function3[/* a */ T0, /* b */ T1, /* c */ T2, Any]): ArgCaptor3[T0, T1, T2] = js.native
    def apply[T0, T1, T2, T3](method: js.Function4[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, Any]): ArgCaptor4[T0, T1, T2, T3] = js.native
    def apply[T0, T1, T2, T3, T4](method: js.Function5[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, Any]): ArgCaptor5[T0, T1, T2, T3, T4] = js.native
    def apply[T0, T1, T2, T3, T4, T5](method: js.Function6[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, Any]): ArgCaptor6[T0, T1, T2, T3, T4, T5] = js.native
    def apply[T0, T1, T2, T3, T4, T5, T6](
      method: js.Function7[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, /* g */ T6, Any]
    ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = js.native
    def apply[T0, T1, T2, T3, T4, T5, T6, T7](
      method: js.Function8[
          /* a */ T0, 
          /* b */ T1, 
          /* c */ T2, 
          /* d */ T3, 
          /* e */ T4, 
          /* f */ T5, 
          /* g */ T6, 
          /* h */ T7, 
          Any
        ]
    ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
    def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8](
      method: js.Function9[
          /* a */ T0, 
          /* b */ T1, 
          /* c */ T2, 
          /* d */ T3, 
          /* e */ T4, 
          /* f */ T5, 
          /* g */ T6, 
          /* h */ T7, 
          /* i */ T8, 
          Any
        ]
    ): ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
    def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
      method: js.Function10[
          /* a */ T0, 
          /* b */ T1, 
          /* c */ T2, 
          /* d */ T3, 
          /* e */ T4, 
          /* f */ T5, 
          /* g */ T6, 
          /* h */ T7, 
          /* i */ T8, 
          /* j */ T9, 
          Any
        ]
    ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](expectedValue: T): T = js.native
  }
  
  @js.native
  trait FnCallClazz extends StObject {
    
    def apply[T](): T = js.native
    def apply[T](clazz: js.Function & js.Object): T = js.native
    def apply[T](clazz: Instantiable1[/* args (repeated) */ Any, T]): T = js.native
    def apply[T](clazz: Any): T = js.native
  }
  
  @js.native
  trait FnCallExpectedClass extends StObject {
    
    def apply[T](expectedClass: Instantiable1[/* args (repeated) */ Any, T]): Any = js.native
  }
  
  @js.native
  trait FnCallMethod extends StObject {
    
    def apply[T](method: T): MethodStubVerificator[T] = js.native
  }
  
  @js.native
  trait FnCallMockedValues extends StObject {
    
    def apply[T](mockedValues: T*): Unit = js.native
  }
}
