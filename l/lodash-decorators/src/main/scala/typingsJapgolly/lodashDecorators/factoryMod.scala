package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.applicatorsMod.Applicator
import typingsJapgolly.lodashDecorators.commonMod.InstanceChainData
import typingsJapgolly.lodashDecorators.decoratorConfigMod.DecoratorConfigOptions
import typingsJapgolly.lodashDecorators.utilsMod.CompositeKeyWeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  @js.native
  class DecoratorConfig protected ()
    extends typingsJapgolly.lodashDecorators.decoratorConfigMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @js.native
  class InternalDecoratorFactory ()
    extends typingsJapgolly.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory
  
  val DecoratorFactory: typingsJapgolly.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory = js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
}

