package typingsJapgolly.sipJs

import org.scalajs.dom.MediaStream
import org.scalajs.dom.MediaStreamConstraints
import typingsJapgolly.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerMediaStreamFactoryMod {
  
  type MediaStreamFactory = js.Function2[
    /* constraints */ MediaStreamConstraints, 
    /* sessionDescriptionHandler */ SessionDescriptionHandler, 
    js.Promise[MediaStream]
  ]
}
