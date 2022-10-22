package typingsJapgolly.haxballHeadlessBrowser

import typingsJapgolly.haxballHeadlessBrowser.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("DiscPropertiesObject")
  @js.native
  open class DiscPropertiesObject ()
    extends StObject
       with typingsJapgolly.haxballHeadlessBrowser.DiscPropertiesObject {
    
    /* CompleteClass */
    var bCoeff: Double = js.native
    
    /* CompleteClass */
    var cGroup: Double = js.native
    
    /* CompleteClass */
    var cMask: Double = js.native
    
    /* CompleteClass */
    var color: Double = js.native
    
    /* CompleteClass */
    var damping: Double = js.native
    
    /* CompleteClass */
    var invMass: Double = js.native
    
    /* CompleteClass */
    var radius: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var xgravity: Double = js.native
    
    /* CompleteClass */
    var xspeed: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
    
    /* CompleteClass */
    var ygravity: Double = js.native
    
    /* CompleteClass */
    var yspeed: Double = js.native
  }
  
  inline def HBInit(roomConfig: RoomConfigObject): typingsJapgolly.haxballHeadlessBrowser.RoomObject = js.Dynamic.global.applyDynamic("HBInit")(roomConfig.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.haxballHeadlessBrowser.RoomObject]
  
  @JSGlobal("PlayerObject")
  @js.native
  open class PlayerObject ()
    extends StObject
       with typingsJapgolly.haxballHeadlessBrowser.PlayerObject {
    
    /* CompleteClass */
    var admin: Boolean = js.native
    
    /* CompleteClass */
    var auth: String = js.native
    
    /* CompleteClass */
    var conn: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var position: X = js.native
    
    /* CompleteClass */
    var team: TeamID = js.native
  }
  
  @JSGlobal("RoomObject")
  @js.native
  open class RoomObject ()
    extends StObject
       with typingsJapgolly.haxballHeadlessBrowser.RoomObject
  
  @JSGlobal("ScoresObject")
  @js.native
  open class ScoresObject ()
    extends StObject
       with typingsJapgolly.haxballHeadlessBrowser.ScoresObject {
    
    /* CompleteClass */
    var blue: Double = js.native
    
    /* CompleteClass */
    var red: Double = js.native
    
    /* CompleteClass */
    var scoreLimit: Double = js.native
    
    /* CompleteClass */
    var time: Double = js.native
    
    /* CompleteClass */
    var timeLimit: Double = js.native
  }
}
