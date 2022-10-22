package typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod

import typingsJapgolly.reactNavigationStack.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scene[T] extends StObject {
  
  /**
    * Descriptor object for the route containing options and navigation object.
    */
  var descriptor: StackDescriptor
  
  /**
    * Animated nodes representing the progress of the animation.
    */
  var progress: Current
  
  /**
    * Current route object,
    */
  var route: T
}
object Scene {
  
  inline def apply[T](descriptor: StackDescriptor, progress: Current, route: T): Scene[T] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene[T]]
  }
  
  extension [Self <: Scene[?], T](x: Self & Scene[T]) {
    
    inline def setDescriptor(value: StackDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Current): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
