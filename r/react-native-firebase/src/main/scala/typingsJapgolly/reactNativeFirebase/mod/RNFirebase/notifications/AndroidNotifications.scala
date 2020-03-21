package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidNotifications extends js.Object {
  def createChannel(channel: Channel): js.Promise[Unit]
  def createChannelGroup(channelGroup: ChannelGroup): js.Promise[Unit]
  def createChannelGroups(channelGroups: js.Array[ChannelGroup]): js.Promise[Unit]
  def createChannels(channels: js.Array[Channel]): js.Promise[Unit]
  def deleteChannel(channelId: String): js.Promise[Unit]
  def deleteChannelGroup(groupId: String): js.Promise[Unit]
  def getChannel(channelId: String): js.Promise[NativeAndroidChannel | Null]
  def getChannelGroup(channelId: String): js.Promise[NativeAndroidChannelGroup | Null]
  def getChannelGroups(channelId: String): js.Promise[js.Array[NativeAndroidChannelGroup]]
  def getChannels(channelId: String): js.Promise[js.Array[NativeAndroidChannel]]
}

object AndroidNotifications {
  @scala.inline
  def apply(
    createChannel: Channel => CallbackTo[js.Promise[Unit]],
    createChannelGroup: ChannelGroup => CallbackTo[js.Promise[Unit]],
    createChannelGroups: js.Array[ChannelGroup] => CallbackTo[js.Promise[Unit]],
    createChannels: js.Array[Channel] => CallbackTo[js.Promise[Unit]],
    deleteChannel: String => CallbackTo[js.Promise[Unit]],
    deleteChannelGroup: String => CallbackTo[js.Promise[Unit]],
    getChannel: String => CallbackTo[js.Promise[NativeAndroidChannel | Null]],
    getChannelGroup: String => CallbackTo[js.Promise[NativeAndroidChannelGroup | Null]],
    getChannelGroups: String => CallbackTo[js.Promise[js.Array[NativeAndroidChannelGroup]]],
    getChannels: String => CallbackTo[js.Promise[js.Array[NativeAndroidChannel]]]
  ): AndroidNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createChannel")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel) => createChannel(t0).runNow()))
    __obj.updateDynamic("createChannelGroup")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup) => createChannelGroup(t0).runNow()))
    __obj.updateDynamic("createChannelGroups")(js.Any.fromFunction1((t0: js.Array[
  typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup]) => createChannelGroups(t0).runNow()))
    __obj.updateDynamic("createChannels")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel]) => createChannels(t0).runNow()))
    __obj.updateDynamic("deleteChannel")(js.Any.fromFunction1((t0: java.lang.String) => deleteChannel(t0).runNow()))
    __obj.updateDynamic("deleteChannelGroup")(js.Any.fromFunction1((t0: java.lang.String) => deleteChannelGroup(t0).runNow()))
    __obj.updateDynamic("getChannel")(js.Any.fromFunction1((t0: java.lang.String) => getChannel(t0).runNow()))
    __obj.updateDynamic("getChannelGroup")(js.Any.fromFunction1((t0: java.lang.String) => getChannelGroup(t0).runNow()))
    __obj.updateDynamic("getChannelGroups")(js.Any.fromFunction1((t0: java.lang.String) => getChannelGroups(t0).runNow()))
    __obj.updateDynamic("getChannels")(js.Any.fromFunction1((t0: java.lang.String) => getChannels(t0).runNow()))
    __obj.asInstanceOf[AndroidNotifications]
  }
}

