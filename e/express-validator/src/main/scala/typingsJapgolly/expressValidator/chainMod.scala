package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.contextBuilderMod.ContextBuilder
import typingsJapgolly.expressValidator.selectFieldsMod.SelectFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain", JSImport.Namespace)
@js.native
object chainMod extends js.Object {
  @js.native
  class ContextHandlerImpl[Chain] protected ()
    extends typingsJapgolly.expressValidator.contextHandlerImplMod.ContextHandlerImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ContextRunnerImpl protected ()
    extends typingsJapgolly.expressValidator.contextRunnerImplMod.ContextRunnerImpl {
    def this(builder: ContextBuilder) = this()
    def this(builder: ContextBuilder, selectFields: SelectFields_) = this()
  }
  
  @js.native
  class SanitizersImpl[Chain] protected ()
    extends typingsJapgolly.expressValidator.sanitizersImplMod.SanitizersImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ValidatorsImpl[Chain] protected ()
    extends typingsJapgolly.expressValidator.validatorsImplMod.ValidatorsImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
}

