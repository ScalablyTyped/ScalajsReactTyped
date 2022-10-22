package typingsJapgolly.seleniumWebdriver.mod

import typingsJapgolly.seleniumWebdriver.anon.Async
import typingsJapgolly.seleniumWebdriver.anon.AsyncBoolean
import typingsJapgolly.seleniumWebdriver.anon.Bridge
import typingsJapgolly.seleniumWebdriver.libCommandMod.Executor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Actions")
@js.native
open class Actions protected ()
  extends typingsJapgolly.seleniumWebdriver.libInputMod.Actions {
  // region Constructors
  def this(executor: Executor) = this()
  def this(executor: Executor, options: Async) = this()
  def this(executor: Executor, options: AsyncBoolean) = this()
  def this(executor: Executor, options: Bridge) = this()
}
