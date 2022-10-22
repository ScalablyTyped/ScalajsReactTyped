package typingsJapgolly.phaser.matterMod

import typingsJapgolly.phaser.MatterJS.ICollisionData
import typingsJapgolly.phaser.MatterJS.ICollisionFilter
import typingsJapgolly.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter", "DetectorFactory")
@js.native
open class DetectorFactory ()
  extends StObject
     with typingsJapgolly.phaser.MatterJS.DetectorFactory {
  
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param {} filterA
    * @param {} filterB
    * @return {bool} `true` if collision can occur
    */
  /* CompleteClass */
  override def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean = js.native
  
  /**
    * Finds all collisions given a list of pairs.
    * @method collisions
    * @param {pair[]} broadphasePairs
    * @param {engine} engine
    * @return {ICollisionData[]} collisions
    */
  /* CompleteClass */
  override def collisions(broadphasePairs: js.Array[IPair], engine: typingsJapgolly.phaser.MatterJS.Engine): js.Array[ICollisionData] = js.native
}
