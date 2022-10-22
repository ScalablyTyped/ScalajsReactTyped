package typingsJapgolly.manaSyringe

import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Module
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleMod {
  
  @JSImport("mana-syringe/lib/module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Module(): typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")().asInstanceOf[typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule]
  inline def Module(register: Registry): typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")(register.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule]
  
  @JSImport("mana-syringe/lib/module", "SyringeModule")
  @js.native
  open class SyringeModule ()
    extends typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule {
    def this(registry: Registry) = this()
  }
  
  inline def isSyringeModule(data: Module): /* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyringeModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean]
}
