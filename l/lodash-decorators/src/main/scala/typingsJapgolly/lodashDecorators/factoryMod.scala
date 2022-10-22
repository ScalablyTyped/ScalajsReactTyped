package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.applicatorsMod.Applicator
import typingsJapgolly.lodashDecorators.factoryCommonMod.InstanceChainData
import typingsJapgolly.lodashDecorators.factoryDecoratorConfigMod.DecoratorConfigOptions
import typingsJapgolly.lodashDecorators.utilsMod.CompositeKeyWeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("lodash-decorators/factory", "DecoratorConfig")
  @js.native
  open class DecoratorConfig protected ()
    extends typingsJapgolly.lodashDecorators.factoryDecoratorConfigMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @JSImport("lodash-decorators/factory", "DecoratorFactory")
  @js.native
  val DecoratorFactory: typingsJapgolly.lodashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory = js.native
  
  @JSImport("lodash-decorators/factory", "InstanceChainMap")
  @js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  
  @JSImport("lodash-decorators/factory", "InternalDecoratorFactory")
  @js.native
  open class InternalDecoratorFactory ()
    extends typingsJapgolly.lodashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory
}
