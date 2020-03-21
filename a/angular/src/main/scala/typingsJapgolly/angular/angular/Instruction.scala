package typingsJapgolly.angular.angular

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Instruction` is a tree of {@link ComponentInstruction}s with all the information needed
  * to transition each component in the app to a given route, including all auxiliary routes.
  *
  * `Instruction`s can be created using {@link Router#generate}, and can be used to
  * perform route changes with {@link Router#navigateByInstruction}.
  *
  * ### Example
  *
  * ```
  * import { Component } from 'angular2/core';
  * import {bootstrap} from 'angular2/platform/browser';
  * import {Router, ROUTER_DIRECTIVES, ROUTER_PROVIDERS, RouteConfig} from 'angular2/router';
  *
  * @Component({directives: [ROUTER_DIRECTIVES]})
  * @RouteConfig([
  *  {...},
  * ])
  * class AppCmp {
  *   constructor(router: Router) {
  *     var instruction = router.generate(['/MyRoute']);
  *     router.navigateByInstruction(instruction);
  *   }
  * }
  *
  * bootstrap(AppCmp, ROUTER_PROVIDERS);
  * ```
  */
trait Instruction extends js.Object {
  var auxInstruction: StringDictionary[Instruction]
  var child: Instruction
  var component: ComponentInstruction
  /**
    * Returns a new instruction that shares the state of the existing instruction, but with
    * the given child {@link Instruction} replacing the existing child.
    */
  def replaceChild(child: Instruction): Instruction
  def resolveComponent(): js.Any
  def specificity(): Double
  /**
    * default instructions override these
    */
  def toLinkUrl(): String
  /**
    * converts the instruction into a URL string
    */
  def toRootUrl(): String
  /**
    * If the final URL for the instruction is ``
    */
  def toUrlPath(): String
  def toUrlQuery(): String
  def urlParams(): js.Array[String]
  def urlPath(): String
}

object Instruction {
  @scala.inline
  def apply(
    auxInstruction: StringDictionary[Instruction],
    child: Instruction,
    component: ComponentInstruction,
    replaceChild: Instruction => CallbackTo[Instruction],
    resolveComponent: CallbackTo[js.Any],
    specificity: CallbackTo[Double],
    toLinkUrl: CallbackTo[String],
    toRootUrl: CallbackTo[String],
    toUrlPath: CallbackTo[String],
    toUrlQuery: CallbackTo[String],
    urlParams: CallbackTo[js.Array[String]],
    urlPath: CallbackTo[String]
  ): Instruction = {
    val __obj = js.Dynamic.literal(auxInstruction = auxInstruction.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("replaceChild")(js.Any.fromFunction1((t0: typingsJapgolly.angular.angular.Instruction) => replaceChild(t0).runNow()))
    __obj.updateDynamic("resolveComponent")(resolveComponent.toJsFn)
    __obj.updateDynamic("specificity")(specificity.toJsFn)
    __obj.updateDynamic("toLinkUrl")(toLinkUrl.toJsFn)
    __obj.updateDynamic("toRootUrl")(toRootUrl.toJsFn)
    __obj.updateDynamic("toUrlPath")(toUrlPath.toJsFn)
    __obj.updateDynamic("toUrlQuery")(toUrlQuery.toJsFn)
    __obj.updateDynamic("urlParams")(urlParams.toJsFn)
    __obj.updateDynamic("urlPath")(urlPath.toJsFn)
    __obj.asInstanceOf[Instruction]
  }
}

