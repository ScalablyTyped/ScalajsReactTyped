package typingsJapgolly.inversify

import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Binding
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.BindingInSyntax
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.BindingOnSyntax
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.BindingWhenOnSyntax
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.BindingWhenSyntax
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyntaxBindingInWhenOnSyntaxMod {
  
  @JSImport("inversify/lib/syntax/binding_in_when_on_syntax", "BindingInWhenOnSyntax")
  @js.native
  open class BindingInWhenOnSyntax[T] protected ()
    extends StObject
       with BindingInSyntax[T]
       with BindingWhenSyntax[T]
       with BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    /* private */ var _binding: Any = js.native
    
    /* private */ var _bindingInSyntax: Any = js.native
    
    /* private */ var _bindingOnSyntax: Any = js.native
    
    /* private */ var _bindingWhenSyntax: Any = js.native
    
    /* CompleteClass */
    override def inRequestScope(): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def inSingletonScope(): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def inTransientScope(): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def onActivation(fn: js.Function2[/* context */ Context, T, T | js.Promise[T]]): BindingWhenSyntax[T] = js.native
    
    /* CompleteClass */
    override def onDeactivation(fn: js.Function1[T, Unit | js.Promise[Unit]]): BindingWhenSyntax[T] = js.native
  }
}
