package typingsJapgolly.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertGraphAndFetch[QM /* <: Model */] extends js.Object {
  def apply(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def apply(modelOrObject: DeepPartialGraph[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def apply(modelOrObject: DeepPartialGraph[QM], options: InsertGraphOptions): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def apply(modelsOrObjects: js.Array[DeepPartialGraph[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def apply(modelsOrObjects: js.Array[DeepPartialGraph[QM]], options: InsertGraphOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
}

