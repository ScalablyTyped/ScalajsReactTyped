package typingsJapgolly.inversifyBindingDecorators

import typingsJapgolly.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideInSyntax
import typingsJapgolly.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideOnSyntax
import typingsJapgolly.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideWhenSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsSyntaxProvideInWhenOnSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_in_when_on_syntax", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with ProvideInWhenOnSyntax[T] {
    def this(
      provideInSyntax: ProvideInSyntax[T],
      provideWhenSyntax: ProvideWhenSyntax[T],
      provideOnSyntax: ProvideOnSyntax[T]
    ) = this()
  }
  
  @js.native
  trait ProvideInWhenOnSyntax[T]
    extends StObject
       with typingsJapgolly.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideInWhenOnSyntax[T] {
    
    /* private */ var _provideInSyntax: Any = js.native
    
    /* private */ var _provideOnSyntax: Any = js.native
    
    /* private */ var _provideWhenSyntax: Any = js.native
  }
}
