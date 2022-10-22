package typingsJapgolly.dynogels

import typingsJapgolly.dynogels.mod.LifeCycleAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynogelsStrings {
  
  @js.native
  sealed trait create
    extends StObject
       with LifeCycleAction
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait destroy
    extends StObject
       with LifeCycleAction
  inline def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait update
    extends StObject
       with LifeCycleAction
  inline def update: update = "update".asInstanceOf[update]
}
