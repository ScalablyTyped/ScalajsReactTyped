package typingsJapgolly.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("UnityIndicatorProperties")
  @js.native
  open class UnityIndicatorProperties ()
    extends StObject
       with typingsJapgolly.unityWebapi.UnityIndicatorProperties {
    
    /* CompleteClass */
    var count: Double = js.native
    
    /* CompleteClass */
    var iconURI: String = js.native
    
    /* CompleteClass */
    var onIndicatorActivated: js.Function = js.native
    
    /* CompleteClass */
    var time: js.Date = js.native
  }
  
  @JSGlobal("UnityPlaybackState")
  @js.native
  object UnityPlaybackState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.unityWebapi.UnityPlaybackState & Double] = js.native
    
    /* 1 */ val Paused: typingsJapgolly.unityWebapi.UnityPlaybackState.Paused & Double = js.native
    
    /* 0 */ val Playing: typingsJapgolly.unityWebapi.UnityPlaybackState.Playing & Double = js.native
  }
  
  @JSGlobal("UnitySettings")
  @js.native
  open class UnitySettings ()
    extends StObject
       with typingsJapgolly.unityWebapi.UnitySettings {
    
    /* CompleteClass */
    var iconUrl: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var onInit: js.Function = js.native
  }
  
  @JSGlobal("UnityTrackMetadata")
  @js.native
  open class UnityTrackMetadata ()
    extends StObject
       with typingsJapgolly.unityWebapi.UnityTrackMetadata {
    
    // Optionals
    /* CompleteClass */
    var album: String = js.native
    
    /* CompleteClass */
    var artLocation: String = js.native
    
    /* CompleteClass */
    var artist: String = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
}
