package typingsJapgolly.mochaSugarFree.mod

import typingsJapgolly.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typingsJapgolly.mochaSugarFree.mochaSugarFreeBooleans.`true`
import typingsJapgolly.mochaSugarFree.mochaSugarFreeStrings.after
import typingsJapgolly.mochaSugarFree.mochaSugarFreeStrings.afterEach
import typingsJapgolly.mochaSugarFree.mochaSugarFreeStrings.before
import typingsJapgolly.mochaSugarFree.mochaSugarFreeStrings.beforeEach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookContext extends js.Object {
  var hook: before | after | beforeEach | afterEach
  var isHook: `true`
  var isSuite: `false`
  var isTest: `false`
}

object HookContext {
  @scala.inline
  def apply(hook: before | after | beforeEach | afterEach, isHook: `true`, isSuite: `false`, isTest: `false`): HookContext = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], isHook = isHook.asInstanceOf[js.Any], isSuite = isSuite.asInstanceOf[js.Any], isTest = isTest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookContext]
  }
}

