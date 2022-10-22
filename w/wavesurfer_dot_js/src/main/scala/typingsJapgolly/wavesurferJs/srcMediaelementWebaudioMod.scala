package typingsJapgolly.wavesurferJs

import org.scalajs.dom.HTMLMediaElement
import typingsJapgolly.wavesurferJs.typesParamsMod.WaveSurferParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMediaelementWebaudioMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.wavesurferJs.typesBackendMod.WaveSurferBackend because Already inherited */ @JSImport("wavesurfer.js/src/mediaelement-webaudio", JSImport.Default)
  @js.native
  open class default protected () extends MediaElementWebAudio {
    def this(params: WaveSurferParams) = this()
  }
  
  @js.native
  trait MediaElementWebAudio
    extends typingsJapgolly.wavesurferJs.srcMediaelementMod.default {
    
    def createMediaElementSource(mediaElement: HTMLMediaElement): Unit = js.native
  }
}
