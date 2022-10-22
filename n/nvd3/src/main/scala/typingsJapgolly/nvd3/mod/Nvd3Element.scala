package typingsJapgolly.nvd3.mod

import typingsJapgolly.d3Dispatch.mod.Dispatch_
import typingsJapgolly.d3Selection.mod.BaseType
import typingsJapgolly.d3Selection.mod.Selection_
import typingsJapgolly.d3Transition.mod.Transition_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nvd3Element extends StObject {
  
  def apply(
    selection: Selection_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  def apply(
    transition: Transition_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  
  var dispatch: Dispatch_[js.Object] = js.native
  
  def options(options: Any): this.type = js.native
  
  def update(): Unit = js.native
}
