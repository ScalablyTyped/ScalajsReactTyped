package typingsJapgolly.screeps.global

import typingsJapgolly.screeps.anon.GHO2
import typingsJapgolly.screeps.anon.KH
import typingsJapgolly.screeps.anon.KHO2
import typingsJapgolly.screeps.anon.LH
import typingsJapgolly.screeps.anon.LHO2
import typingsJapgolly.screeps.anon.UH
import typingsJapgolly.screeps.anon.XZHO2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BOOSTS {
  
  @JSGlobal("BOOSTS")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BOOSTS.attack")
  @js.native
  def attack: UH = js.native
  inline def attack_=(x: UH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attack")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BOOSTS.carry")
  @js.native
  def carry: KH = js.native
  inline def carry_=(x: KH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carry")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BOOSTS.heal")
  @js.native
  def heal: LHO2 = js.native
  inline def heal_=(x: LHO2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heal")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BOOSTS.move")
  @js.native
  def move: XZHO2 = js.native
  inline def move_=(x: XZHO2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("move")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BOOSTS.ranged_attack")
  @js.native
  def rangedAttack: KHO2 = js.native
  
  inline def rangedAttack_=(x: KHO2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranged_attack")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BOOSTS.tough")
  @js.native
  def tough: GHO2 = js.native
  inline def tough_=(x: GHO2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tough")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BOOSTS.work")
  @js.native
  def work: LH = js.native
  inline def work_=(x: LH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("work")(x.asInstanceOf[js.Any])
}
