package typingsJapgolly.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Strategy extends StObject
@JSImport("aurelia-dependency-injection", "Strategy")
@js.native
object Strategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Strategy & Double] = js.native
  
  @js.native
  sealed trait alias
    extends StObject
       with Strategy
  /* 5 */ val alias: typingsJapgolly.aureliaDependencyInjection.mod.Strategy.alias & Double = js.native
  
  @js.native
  sealed trait array
    extends StObject
       with Strategy
  /* 4 */ val array: typingsJapgolly.aureliaDependencyInjection.mod.Strategy.array & Double = js.native
  
  @js.native
  sealed trait function
    extends StObject
       with Strategy
  /* 3 */ val function: typingsJapgolly.aureliaDependencyInjection.mod.Strategy.function & Double = js.native
  
  @js.native
  sealed trait instance
    extends StObject
       with Strategy
  /* 0 */ val instance: typingsJapgolly.aureliaDependencyInjection.mod.Strategy.instance & Double = js.native
  
  @js.native
  sealed trait singleton
    extends StObject
       with Strategy
  /* 1 */ val singleton: typingsJapgolly.aureliaDependencyInjection.mod.Strategy.singleton & Double = js.native
  
  @js.native
  sealed trait transient
    extends StObject
       with Strategy
  /* 2 */ val transient: typingsJapgolly.aureliaDependencyInjection.mod.Strategy.transient & Double = js.native
}
