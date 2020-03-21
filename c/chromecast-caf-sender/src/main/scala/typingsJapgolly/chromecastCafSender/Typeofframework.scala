package typingsJapgolly.chromecastCafSender

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.chrome.chrome.cast.ErrorCode
import typingsJapgolly.chrome.chrome.cast.Session
import typingsJapgolly.chrome.chrome.cast.media.Media
import typingsJapgolly.chromecastCafSender.cast.framework.ActiveInputState
import typingsJapgolly.chromecastCafSender.cast.framework.ActiveInputStateEventData
import typingsJapgolly.chromecastCafSender.cast.framework.ApplicationMetadata
import typingsJapgolly.chromecastCafSender.cast.framework.ApplicationMetadataEventData
import typingsJapgolly.chromecastCafSender.cast.framework.ApplicationStatusEventData
import typingsJapgolly.chromecastCafSender.cast.framework.CastSession
import typingsJapgolly.chromecastCafSender.cast.framework.CastState
import typingsJapgolly.chromecastCafSender.cast.framework.CastStateEventData
import typingsJapgolly.chromecastCafSender.cast.framework.EventData
import typingsJapgolly.chromecastCafSender.cast.framework.LoggerLevel
import typingsJapgolly.chromecastCafSender.cast.framework.MediaSessionEventData
import typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayer
import typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerChangedEvent
import typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerController
import typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType
import typingsJapgolly.chromecastCafSender.cast.framework.SessionState
import typingsJapgolly.chromecastCafSender.cast.framework.SessionStateEventData
import typingsJapgolly.chromecastCafSender.cast.framework.VolumeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofframework extends js.Object {
  var ActiveInputStateEventData: Instantiable1[
    /* activeInputState */ ActiveInputState, 
    typingsJapgolly.chromecastCafSender.cast.framework.ActiveInputStateEventData
  ]
  var ApplicationMetadata: Instantiable1[
    /* sessionObj */ Session, 
    typingsJapgolly.chromecastCafSender.cast.framework.ApplicationMetadata
  ]
  var ApplicationMetadataEventData: Instantiable1[
    /* metadata */ ApplicationMetadata, 
    typingsJapgolly.chromecastCafSender.cast.framework.ApplicationMetadataEventData
  ]
  var ApplicationStatusEventData: Instantiable1[
    /* status */ String, 
    typingsJapgolly.chromecastCafSender.cast.framework.ApplicationStatusEventData
  ]
  var CastContext: TypeofCastContext
  var CastSession: Instantiable2[
    /* sessionObj */ Session, 
    /* state */ SessionState, 
    typingsJapgolly.chromecastCafSender.cast.framework.CastSession
  ]
  var CastStateEventData: Instantiable1[
    /* castState */ CastState, 
    typingsJapgolly.chromecastCafSender.cast.framework.CastStateEventData
  ]
  var EventData: Instantiable1[/* type */ String, typingsJapgolly.chromecastCafSender.cast.framework.EventData]
  var MediaSessionEventData: Instantiable1[
    /* mediaSession */ Media, 
    typingsJapgolly.chromecastCafSender.cast.framework.MediaSessionEventData
  ]
  var RemotePlayer: Instantiable0[typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayer]
  var RemotePlayerChangedEvent: Instantiable3[
    /* type */ RemotePlayerEventType, 
    /* field */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
    typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[js.Object]
  ]
  var RemotePlayerController: Instantiable1[
    /* player */ RemotePlayer, 
    typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerController
  ]
  var SessionStateEventData: Instantiable3[
    /* session */ CastSession, 
    /* sessionState */ SessionState, 
    /* opt_errorCode */ ErrorCode, 
    typingsJapgolly.chromecastCafSender.cast.framework.SessionStateEventData
  ]
  val VERSION: String
  var VolumeEventData: Instantiable2[
    /* volume */ Double, 
    /* isMute */ Boolean, 
    typingsJapgolly.chromecastCafSender.cast.framework.VolumeEventData
  ]
  def setLoggerLevel(level: LoggerLevel): Unit
}

object Typeofframework {
  @scala.inline
  def apply(
    ActiveInputStateEventData: Instantiable1[/* activeInputState */ ActiveInputState, ActiveInputStateEventData],
    ApplicationMetadata: Instantiable1[/* sessionObj */ Session, ApplicationMetadata],
    ApplicationMetadataEventData: Instantiable1[/* metadata */ ApplicationMetadata, ApplicationMetadataEventData],
    ApplicationStatusEventData: Instantiable1[/* status */ String, ApplicationStatusEventData],
    CastContext: TypeofCastContext,
    CastSession: Instantiable2[/* sessionObj */ Session, /* state */ SessionState, CastSession],
    CastStateEventData: Instantiable1[/* castState */ CastState, CastStateEventData],
    EventData: Instantiable1[/* type */ String, EventData],
    MediaSessionEventData: Instantiable1[/* mediaSession */ Media, MediaSessionEventData],
    RemotePlayer: Instantiable0[RemotePlayer],
    RemotePlayerChangedEvent: Instantiable3[
      /* type */ RemotePlayerEventType, 
      /* field */ String, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
      RemotePlayerChangedEvent[js.Object]
    ],
    RemotePlayerController: Instantiable1[/* player */ RemotePlayer, RemotePlayerController],
    SessionStateEventData: Instantiable3[
      /* session */ CastSession, 
      /* sessionState */ SessionState, 
      /* opt_errorCode */ ErrorCode, 
      SessionStateEventData
    ],
    VERSION: String,
    VolumeEventData: Instantiable2[/* volume */ Double, /* isMute */ Boolean, VolumeEventData],
    setLoggerLevel: LoggerLevel => Callback
  ): Typeofframework = {
    val __obj = js.Dynamic.literal(ActiveInputStateEventData = ActiveInputStateEventData.asInstanceOf[js.Any], ApplicationMetadata = ApplicationMetadata.asInstanceOf[js.Any], ApplicationMetadataEventData = ApplicationMetadataEventData.asInstanceOf[js.Any], ApplicationStatusEventData = ApplicationStatusEventData.asInstanceOf[js.Any], CastContext = CastContext.asInstanceOf[js.Any], CastSession = CastSession.asInstanceOf[js.Any], CastStateEventData = CastStateEventData.asInstanceOf[js.Any], EventData = EventData.asInstanceOf[js.Any], MediaSessionEventData = MediaSessionEventData.asInstanceOf[js.Any], RemotePlayer = RemotePlayer.asInstanceOf[js.Any], RemotePlayerChangedEvent = RemotePlayerChangedEvent.asInstanceOf[js.Any], RemotePlayerController = RemotePlayerController.asInstanceOf[js.Any], SessionStateEventData = SessionStateEventData.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any], VolumeEventData = VolumeEventData.asInstanceOf[js.Any])
    __obj.updateDynamic("setLoggerLevel")(js.Any.fromFunction1((t0: typingsJapgolly.chromecastCafSender.cast.framework.LoggerLevel) => setLoggerLevel(t0).runNow()))
    __obj.asInstanceOf[Typeofframework]
  }
}

