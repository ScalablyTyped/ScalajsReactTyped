package typingsJapgolly.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntityDamageCause extends StObject
@JSImport("mojang-minecraft", "EntityDamageCause")
@js.native
object EntityDamageCause extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityDamageCause & String] = js.native
  
  @js.native
  sealed trait anvil
    extends StObject
       with EntityDamageCause
  /* "anvil" */ val anvil: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.anvil & String = js.native
  
  @js.native
  sealed trait blockExplosion
    extends StObject
       with EntityDamageCause
  /* "blockExplosion" */ val blockExplosion: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.blockExplosion & String = js.native
  
  @js.native
  sealed trait charging
    extends StObject
       with EntityDamageCause
  /* "charging" */ val charging: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.charging & String = js.native
  
  @js.native
  sealed trait contact
    extends StObject
       with EntityDamageCause
  /* "contact" */ val contact: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.contact & String = js.native
  
  @js.native
  sealed trait drowning
    extends StObject
       with EntityDamageCause
  /* "drowning" */ val drowning: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.drowning & String = js.native
  
  @js.native
  sealed trait entityAttack
    extends StObject
       with EntityDamageCause
  /* "entityAttack" */ val entityAttack: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.entityAttack & String = js.native
  
  @js.native
  sealed trait entityExplosion
    extends StObject
       with EntityDamageCause
  /* "entityExplosion" */ val entityExplosion: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.entityExplosion & String = js.native
  
  @js.native
  sealed trait fall
    extends StObject
       with EntityDamageCause
  /* "fall" */ val fall: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.fall & String = js.native
  
  @js.native
  sealed trait fallingBlock
    extends StObject
       with EntityDamageCause
  /* "fallingBlock" */ val fallingBlock: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.fallingBlock & String = js.native
  
  @js.native
  sealed trait fire
    extends StObject
       with EntityDamageCause
  /* "fire" */ val fire: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.fire & String = js.native
  
  @js.native
  sealed trait fireTick
    extends StObject
       with EntityDamageCause
  /* "fireTick" */ val fireTick: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.fireTick & String = js.native
  
  @js.native
  sealed trait fireworks
    extends StObject
       with EntityDamageCause
  /* "fireworks" */ val fireworks: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.fireworks & String = js.native
  
  @js.native
  sealed trait flyIntoWall
    extends StObject
       with EntityDamageCause
  /* "flyIntoWall" */ val flyIntoWall: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.flyIntoWall & String = js.native
  
  @js.native
  sealed trait freezing
    extends StObject
       with EntityDamageCause
  /* "freezing" */ val freezing: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.freezing & String = js.native
  
  @js.native
  sealed trait lava
    extends StObject
       with EntityDamageCause
  /* "lava" */ val lava: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.lava & String = js.native
  
  @js.native
  sealed trait lightning
    extends StObject
       with EntityDamageCause
  /* "lightning" */ val lightning: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.lightning & String = js.native
  
  @js.native
  sealed trait magic
    extends StObject
       with EntityDamageCause
  /* "magic" */ val magic: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.magic & String = js.native
  
  @js.native
  sealed trait magma
    extends StObject
       with EntityDamageCause
  /* "magma" */ val magma: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.magma & String = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with EntityDamageCause
  /* "none" */ val none: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.none & String = js.native
  
  @js.native
  sealed trait `override`
    extends StObject
       with EntityDamageCause
  /* "override" */ val `override`: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.`override` & String = js.native
  
  @js.native
  sealed trait piston
    extends StObject
       with EntityDamageCause
  /* "piston" */ val piston: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.piston & String = js.native
  
  @js.native
  sealed trait projectile
    extends StObject
       with EntityDamageCause
  /* "projectile" */ val projectile: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.projectile & String = js.native
  
  @js.native
  sealed trait stalactite
    extends StObject
       with EntityDamageCause
  /* "stalactite" */ val stalactite: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.stalactite & String = js.native
  
  @js.native
  sealed trait stalagmite
    extends StObject
       with EntityDamageCause
  /* "stalagmite" */ val stalagmite: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.stalagmite & String = js.native
  
  @js.native
  sealed trait starve
    extends StObject
       with EntityDamageCause
  /* "starve" */ val starve: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.starve & String = js.native
  
  @js.native
  sealed trait suffocation
    extends StObject
       with EntityDamageCause
  /* "suffocation" */ val suffocation: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.suffocation & String = js.native
  
  @js.native
  sealed trait suicide
    extends StObject
       with EntityDamageCause
  /* "suicide" */ val suicide: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.suicide & String = js.native
  
  @js.native
  sealed trait temperature
    extends StObject
       with EntityDamageCause
  /* "temperature" */ val temperature: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.temperature & String = js.native
  
  @js.native
  sealed trait thorns
    extends StObject
       with EntityDamageCause
  /* "thorns" */ val thorns: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.thorns & String = js.native
  
  @js.native
  sealed trait void
    extends StObject
       with EntityDamageCause
  /* "void" */ val void: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.void & String = js.native
  
  @js.native
  sealed trait wither
    extends StObject
       with EntityDamageCause
  /* "wither" */ val wither: typingsJapgolly.mojangMinecraft.mod.EntityDamageCause.wither & String = js.native
}
