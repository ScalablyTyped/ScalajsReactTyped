package typingsJapgolly.emberController

import typingsJapgolly.emberController.mod.QueryParamScopeTypes
import typingsJapgolly.emberController.mod.QueryParamTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emberControllerStrings {
  @js.native
  sealed trait array extends QueryParamTypes
  
  @js.native
  sealed trait boolean extends QueryParamTypes
  
  @js.native
  sealed trait controller extends QueryParamScopeTypes
  
  @js.native
  sealed trait model extends QueryParamScopeTypes
  
  @js.native
  sealed trait number extends QueryParamTypes
  
  @js.native
  sealed trait string extends QueryParamTypes
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def controller: controller = "controller".asInstanceOf[controller]
  @scala.inline
  def model: model = "model".asInstanceOf[model]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}

