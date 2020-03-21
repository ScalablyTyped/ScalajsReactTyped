package typingsJapgolly.opentok.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTok extends js.Object {
  def createSession(
    options: SessionOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* session */ js.UndefOr[Session], Unit]
  ): Unit
  def deleteArchive(archiveId: String, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit
  def generateToken(sessionId: String, options: TokenOptions): Token
  def getArchive(
    archiveId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit
  def listArchives(
    options: ListArchivesOptions,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit
  def startArchive(
    sessionId: String,
    options: ArchiveOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit
  def stopArchive(
    archiveId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit
}

object OpenTok {
  @scala.inline
  def apply(
    createSession: (SessionOptions, js.Function2[/* error */ js.Error | Null, /* session */ js.UndefOr[Session], Unit]) => Callback,
    deleteArchive: (String, js.Function1[/* error */ js.Error | Null, Unit]) => Callback,
    generateToken: (String, TokenOptions) => CallbackTo[Token],
    getArchive: (String, js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Callback,
    listArchives: (ListArchivesOptions, js.Function3[
      /* error */ js.Error | Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[Double], 
      Unit
    ]) => Callback,
    startArchive: (String, ArchiveOptions, js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Callback,
    stopArchive: (String, js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Callback
  ): OpenTok = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSession")(js.Any.fromFunction2((t0: typingsJapgolly.opentok.mod.SessionOptions, t1: js.Function2[
  /* error */ js.Error | scala.Null, 
  /* session */ js.UndefOr[typingsJapgolly.opentok.mod.Session], 
  scala.Unit]) => createSession(t0, t1).runNow()))
    __obj.updateDynamic("deleteArchive")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* error */ js.Error | scala.Null, scala.Unit]) => deleteArchive(t0, t1).runNow()))
    __obj.updateDynamic("generateToken")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.opentok.mod.TokenOptions) => generateToken(t0, t1).runNow()))
    __obj.updateDynamic("getArchive")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* error */ js.Error | scala.Null, 
  /* archive */ js.UndefOr[typingsJapgolly.opentok.mod.Archive], 
  scala.Unit]) => getArchive(t0, t1).runNow()))
    __obj.updateDynamic("listArchives")(js.Any.fromFunction2((t0: typingsJapgolly.opentok.mod.ListArchivesOptions, t1: js.Function3[
  /* error */ js.Error | scala.Null, 
  /* archives */ js.UndefOr[js.Array[typingsJapgolly.opentok.mod.Archive]], 
  /* totalCount */ js.UndefOr[scala.Double], 
  scala.Unit]) => listArchives(t0, t1).runNow()))
    __obj.updateDynamic("startArchive")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.opentok.mod.ArchiveOptions, t2: js.Function2[
  /* error */ js.Error | scala.Null, 
  /* archive */ js.UndefOr[typingsJapgolly.opentok.mod.Archive], 
  scala.Unit]) => startArchive(t0, t1, t2).runNow()))
    __obj.updateDynamic("stopArchive")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* error */ js.Error | scala.Null, 
  /* archive */ js.UndefOr[typingsJapgolly.opentok.mod.Archive], 
  scala.Unit]) => stopArchive(t0, t1).runNow()))
    __obj.asInstanceOf[OpenTok]
  }
}

