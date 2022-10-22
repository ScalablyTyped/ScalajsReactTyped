package typingsJapgolly.telebot

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.telebot.anon.CacheTime
import typingsJapgolly.telebot.anon.Caption
import typingsJapgolly.telebot.anon.Cert
import typingsJapgolly.telebot.anon.ChatId
import typingsJapgolly.telebot.anon.Currency
import typingsJapgolly.telebot.anon.Duration
import typingsJapgolly.telebot.anon.ErrorMessage
import typingsJapgolly.telebot.anon.FileName
import typingsJapgolly.telebot.anon.FoursquareId
import typingsJapgolly.telebot.anon.Height
import typingsJapgolly.telebot.anon.InlineMessageId
import typingsJapgolly.telebot.anon.InlineMsgId
import typingsJapgolly.telebot.anon.Interval
import typingsJapgolly.telebot.anon.Limit
import typingsJapgolly.telebot.anon.MessageId
import typingsJapgolly.telebot.anon.Notification
import typingsJapgolly.telebot.anon.NotificationReplyMarkup
import typingsJapgolly.telebot.anon.ParseMode
import typingsJapgolly.telebot.anon.ReplyMarkup
import typingsJapgolly.telebot.anon.ReplyToMessage
import typingsJapgolly.telebot.anon.`0`
import typingsJapgolly.telebot.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("telebot", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typingsJapgolly.telebot.mod.telebot {
    def this(config: String) = this()
    def this(config: typingsJapgolly.telebot.mod.config) = this()
  }
  @JSImport("telebot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("telebot", "AnswerList")
  @js.native
  open class AnswerList protected () extends StObject {
    def this(id: String) = this()
    def this(id: String, opt: Any) = this()
    
    def add(`type`: String): Any = js.native
    def add(`type`: String, set: Any): Any = js.native
    
    def addArticle(): Any = js.native
    def addArticle(set: Any): Any = js.native
    
    def addDocument(): Any = js.native
    def addDocument(set: Any): Any = js.native
    
    def addGame(): Any = js.native
    def addGame(set: Any): Any = js.native
    
    def addGif(): Any = js.native
    def addGif(set: Any): Any = js.native
    
    def addLocation(): Any = js.native
    def addLocation(set: Any): Any = js.native
    
    def addPhoto(): Any = js.native
    def addPhoto(set: Any): Any = js.native
    
    def addSticker(): Any = js.native
    def addSticker(set: Any): Any = js.native
    
    def addVenue(): Any = js.native
    def addVenue(set: Any): Any = js.native
    
    def addVideo(): Any = js.native
    def addVideo(set: Any): Any = js.native
    
    def addVideoGif(): Any = js.native
    def addVideoGif(set: Any): Any = js.native
    
    def addVoice(): Any = js.native
    def addVoice(set: Any): Any = js.native
    
    def cachedAudio(): Any = js.native
    def cachedAudio(set: Any): Any = js.native
    
    def cachedDocument(): Any = js.native
    def cachedDocument(set: Any): Any = js.native
    
    def cachedGif(): Any = js.native
    def cachedGif(set: Any): Any = js.native
    
    // Cached methods
    def cachedPhoto(): Any = js.native
    def cachedPhoto(set: Any): Any = js.native
    
    def cachedSticker(): Any = js.native
    def cachedSticker(set: Any): Any = js.native
    
    def cachedVideo(): Any = js.native
    def cachedVideo(set: Any): Any = js.native
    
    def cachedVideoGif(): Any = js.native
    def cachedVideoGif(set: Any): Any = js.native
    
    def cachedVoice(): Any = js.native
    def cachedVoice(set: Any): Any = js.native
    
    def results(): String = js.native
  }
  
  /* static member */
  inline def addMethods(methods: (genericCb | Any)*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addMethods")(methods.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  trait config extends StObject {
    
    var allowedUpdates: js.UndefOr[js.Array[String]] = js.undefined
    
    // Optional. Plugin folder location relative to telebot package.
    var pluginConfig: js.UndefOr[Any] = js.undefined
    
    // Optional. Use build-in plugins from pluginFolder.
    var pluginFolder: js.UndefOr[String] = js.undefined
    
    // Required. Telegram Bot API token.
    var polling: js.UndefOr[Interval] = js.undefined
    
    var token: String
    
    // Optional. List the types of updates you want your bot to receive. Specify an empty list to receive all updates.
    var usePlugins: js.UndefOr[js.Array[String]] = js.undefined
    
    var webhook: js.UndefOr[Cert] = js.undefined
  }
  object config {
    
    inline def apply(token: String): config = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[config]
    }
    
    extension [Self <: config](x: Self) {
      
      inline def setAllowedUpdates(value: js.Array[String]): Self = StObject.set(x, "allowedUpdates", value.asInstanceOf[js.Any])
      
      inline def setAllowedUpdatesUndefined: Self = StObject.set(x, "allowedUpdates", js.undefined)
      
      inline def setAllowedUpdatesVarargs(value: String*): Self = StObject.set(x, "allowedUpdates", js.Array(value*))
      
      inline def setPluginConfig(value: Any): Self = StObject.set(x, "pluginConfig", value.asInstanceOf[js.Any])
      
      inline def setPluginConfigUndefined: Self = StObject.set(x, "pluginConfig", js.undefined)
      
      inline def setPluginFolder(value: String): Self = StObject.set(x, "pluginFolder", value.asInstanceOf[js.Any])
      
      inline def setPluginFolderUndefined: Self = StObject.set(x, "pluginFolder", js.undefined)
      
      inline def setPolling(value: Interval): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUsePlugins(value: js.Array[String]): Self = StObject.set(x, "usePlugins", value.asInstanceOf[js.Any])
      
      inline def setUsePluginsUndefined: Self = StObject.set(x, "usePlugins", js.undefined)
      
      inline def setUsePluginsVarargs(value: String*): Self = StObject.set(x, "usePlugins", js.Array(value*))
      
      inline def setWebhook(value: Cert): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
      
      inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
    }
  }
  
  @js.native
  trait genericCb extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait module extends StObject {
    
    var defaultConfig: Any
    
    var id: String
    
    def plugin(args: Any*): Unit
  }
  object module {
    
    inline def apply(defaultConfig: Any, id: String, plugin: /* repeated */ Any => Callback): module = {
      val __obj = js.Dynamic.literal(defaultConfig = defaultConfig.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plugin = js.Any.fromFunction1((t0: /* repeated */ Any) => plugin(t0).runNow()))
      __obj.asInstanceOf[module]
    }
    
    extension [Self <: module](x: Self) {
      
      inline def setDefaultConfig(value: Any): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: /* repeated */ Any => Callback): Self = StObject.set(x, "plugin", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait telebot extends StObject {
    
    def answerCallbackQuery(callback_query_id: String): js.Promise[Boolean] = js.native
    def answerCallbackQuery(callback_query_id: String, opt: CacheTime): js.Promise[Boolean] = js.native
    
    def answerList(id: String): AnswerList = js.native
    def answerList(id: String, opt: Any): AnswerList = js.native
    
    def answerPreCheckoutQuery(pre_checkout_query_id: String, ok: Boolean): js.Promise[Boolean] = js.native
    def answerPreCheckoutQuery(pre_checkout_query_id: String, ok: Boolean, opt: `1`): js.Promise[Boolean] = js.native
    
    def answerQuery(param: Any*): js.Promise[Boolean] = js.native
    
    def answerShippingQuery(shipping_query_id: String, ok: Boolean): js.Promise[Boolean] = js.native
    def answerShippingQuery(shipping_query_id: String, ok: Boolean, opt: ErrorMessage): js.Promise[Boolean] = js.native
    
    def button(`type`: String): Any = js.native
    def button(`type`: String, text: String): Any = js.native
    
    def cleanEvent(`type`: String): Boolean = js.native
    
    def connect(args: Any*): Unit = js.native
    
    def deleteMessage(chat_id: String, from_message_id: Double): js.Promise[Boolean] = js.native
    def deleteMessage(chat_id: Double, from_message_id: Double): js.Promise[Boolean] = js.native
    
    def deleteWebhook(): js.Promise[Boolean] = js.native
    
    def destroyEvent(`type`: String): Boolean = js.native
    
    def editMessageCaption(config: InlineMsgId, caption: String): js.Promise[Any | Boolean] = js.native
    def editMessageCaption(config: MessageId, caption: String): js.Promise[Any | Boolean] = js.native
    
    def editMessageReplyMarkup(config: InlineMsgId, replyMarkup: Any): js.Promise[Any | Boolean] = js.native
    def editMessageReplyMarkup(config: MessageId, replyMarkup: Any): js.Promise[Any | Boolean] = js.native
    
    def editMessageText(config: InlineMsgId, text: String): js.Promise[Any | Boolean] = js.native
    def editMessageText(config: InlineMsgId, text: String, opt: ParseMode): js.Promise[Any | Boolean] = js.native
    def editMessageText(config: MessageId, text: String): js.Promise[Any | Boolean] = js.native
    def editMessageText(config: MessageId, text: String, opt: ParseMode): js.Promise[Any | Boolean] = js.native
    
    def event(types: String, data: Any): js.Promise[Any] = js.native
    def event(types: String, data: Any, self: Any): js.Promise[Any] = js.native
    def event(types: js.Array[String], data: Any): js.Promise[Any] = js.native
    def event(types: js.Array[String], data: Any, self: Any): js.Promise[Any] = js.native
    
    def forwardMessage(chat_id: String, from_chat_id: String, message_id: Double): js.Promise[Any] = js.native
    def forwardMessage(chat_id: String, from_chat_id: String, message_id: Double, opt: `0`): js.Promise[Any] = js.native
    def forwardMessage(chat_id: String, from_chat_id: Double, message_id: Double): js.Promise[Any] = js.native
    def forwardMessage(chat_id: String, from_chat_id: Double, message_id: Double, opt: `0`): js.Promise[Any] = js.native
    def forwardMessage(chat_id: Double, from_chat_id: String, message_id: Double): js.Promise[Any] = js.native
    def forwardMessage(chat_id: Double, from_chat_id: String, message_id: Double, opt: `0`): js.Promise[Any] = js.native
    def forwardMessage(chat_id: Double, from_chat_id: Double, message_id: Double): js.Promise[Any] = js.native
    def forwardMessage(chat_id: Double, from_chat_id: Double, message_id: Double, opt: `0`): js.Promise[Any] = js.native
    
    def getChat(chat_id: String): js.Promise[Any] = js.native
    def getChat(chat_id: Double): js.Promise[Any] = js.native
    
    def getChatAdministrators(chat_id: String): js.Promise[js.Array[Any] | Any] = js.native
    def getChatAdministrators(chat_id: Double): js.Promise[js.Array[Any] | Any] = js.native
    
    def getChatMember(chat_id: String, user_id: Double): js.Promise[Any] = js.native
    def getChatMember(chat_id: Double, user_id: Double): js.Promise[Any] = js.native
    
    def getChatMembersCount(chat_id: String): js.Promise[Double] = js.native
    def getChatMembersCount(chat_id: Double): js.Promise[Double] = js.native
    
    def getFile(file_id: String): js.Promise[Any] = js.native
    
    def getGameHighScores(user_id: Double): js.Promise[js.Array[Any]] = js.native
    def getGameHighScores(user_id: Double, opt: InlineMessageId): js.Promise[js.Array[Any]] = js.native
    
    // Telegram API
    def getMe(): js.Promise[Any] = js.native
    
    def getUpdates(offset: Double, limit: Double, timeout: Double, allowed_updates: String): Unit = js.native
    def getUpdates(offset: Double, limit: Double, timeout: Double, allowed_updates: js.Array[String]): Unit = js.native
    
    def getUserProfilePhotos(user_id: Double): js.Promise[Any] = js.native
    def getUserProfilePhotos(user_id: Double, opt: Limit): js.Promise[Any] = js.native
    
    def getWebhookInfo(): js.Promise[Any] = js.native
    
    def inlineButton(text: String): Any = js.native
    def inlineButton(text: String, opt: Any): Any = js.native
    
    def inlineKeyboard(inlineButtons: js.Array[js.Array[Any]]): Any = js.native
    
    def inlineQueryKeyboard(config: js.Array[js.Array[Any]]): Any = js.native
    
    // methods.js
    def keyboard(buttons: js.Array[js.Array[Any]]): Any = js.native
    def keyboard(buttons: js.Array[js.Array[Any]], opt: Any): Any = js.native
    
    def kickChatMember(chat_id: String, user_id: Double): js.Promise[Boolean] = js.native
    def kickChatMember(chat_id: Double, user_id: Double): js.Promise[Boolean] = js.native
    
    def leaveChat(chat_id: String): js.Promise[Boolean] = js.native
    def leaveChat(chat_id: Double): js.Promise[Boolean] = js.native
    
    def mod(names: String, fn: genericCb): Any = js.native
    def mod(names: js.Array[String], fn: genericCb): Any = js.native
    
    def modRun(name: String, data: Any): Any = js.native
    
    def on(types: String, fn: genericCb): Boolean = js.native
    def on(types: String, fn: genericCb, opt: Any): Boolean = js.native
    def on(types: js.Array[String], fn: genericCb): Boolean = js.native
    def on(types: js.Array[String], fn: genericCb, opt: Any): Boolean = js.native
    def on(types: js.RegExp, fn: genericCb): Boolean = js.native
    def on(types: js.RegExp, fn: genericCb, opt: Any): Boolean = js.native
    
    def plug(module: module): Unit = js.native
    
    def properties(form: Any, opt: Any): Any = js.native
    
    def receiveUpdates(updateList: js.Array[Any]): js.Promise[Any] = js.native
    
    def removeEvent(`type`: String, fn: genericCb): Boolean = js.native
    
    def removeMod(name: String, fn: genericCb): Boolean = js.native
    
    def request(url: String, form: Any, data: Any): js.Promise[Any] = js.native
    
    def sendAction(chat_id: String, action: String): js.Promise[Boolean] = js.native
    def sendAction(chat_id: Double, action: String): js.Promise[Boolean] = js.native
    
    def sendAudio(chat_id: String, file: String): js.Promise[Any] = js.native
    def sendAudio(chat_id: String, file: String, opt: Duration): js.Promise[Any] = js.native
    def sendAudio(chat_id: String, file: Any): js.Promise[Any] = js.native
    def sendAudio(chat_id: String, file: Any, opt: Duration): js.Promise[Any] = js.native
    def sendAudio(chat_id: String, file: ReadableStream): js.Promise[Any] = js.native
    def sendAudio(chat_id: String, file: ReadableStream, opt: Duration): js.Promise[Any] = js.native
    def sendAudio(chat_id: String, file: Buffer): js.Promise[Any] = js.native
    def sendAudio(chat_id: String, file: Buffer, opt: Duration): js.Promise[Any] = js.native
    def sendAudio(chat_id: Double, file: String): js.Promise[Any] = js.native
    def sendAudio(chat_id: Double, file: String, opt: Duration): js.Promise[Any] = js.native
    def sendAudio(chat_id: Double, file: Any): js.Promise[Any] = js.native
    def sendAudio(chat_id: Double, file: Any, opt: Duration): js.Promise[Any] = js.native
    def sendAudio(chat_id: Double, file: ReadableStream): js.Promise[Any] = js.native
    def sendAudio(chat_id: Double, file: ReadableStream, opt: Duration): js.Promise[Any] = js.native
    def sendAudio(chat_id: Double, file: Buffer): js.Promise[Any] = js.native
    def sendAudio(chat_id: Double, file: Buffer, opt: Duration): js.Promise[Any] = js.native
    
    def sendContact(chat_id: String, number: String, firstName: String): js.Promise[Any] = js.native
    def sendContact(chat_id: String, number: String, firstName: String, lastName: String): js.Promise[Any] = js.native
    def sendContact(chat_id: String, number: String, firstName: String, lastName: String, opt: NotificationReplyMarkup): js.Promise[Any] = js.native
    def sendContact(chat_id: String, number: String, firstName: String, lastName: Unit, opt: NotificationReplyMarkup): js.Promise[Any] = js.native
    def sendContact(chat_id: Double, number: String, firstName: String): js.Promise[Any] = js.native
    def sendContact(chat_id: Double, number: String, firstName: String, lastName: String): js.Promise[Any] = js.native
    def sendContact(chat_id: Double, number: String, firstName: String, lastName: String, opt: NotificationReplyMarkup): js.Promise[Any] = js.native
    def sendContact(chat_id: Double, number: String, firstName: String, lastName: Unit, opt: NotificationReplyMarkup): js.Promise[Any] = js.native
    
    def sendDocument(chat_id: String, file: String): js.Promise[Any] = js.native
    def sendDocument(chat_id: String, file: String, opt: Caption): js.Promise[Any] = js.native
    def sendDocument(chat_id: String, file: Any): js.Promise[Any] = js.native
    def sendDocument(chat_id: String, file: Any, opt: Caption): js.Promise[Any] = js.native
    def sendDocument(chat_id: String, file: ReadableStream): js.Promise[Any] = js.native
    def sendDocument(chat_id: String, file: ReadableStream, opt: Caption): js.Promise[Any] = js.native
    def sendDocument(chat_id: String, file: Buffer): js.Promise[Any] = js.native
    def sendDocument(chat_id: String, file: Buffer, opt: Caption): js.Promise[Any] = js.native
    def sendDocument(chat_id: Double, file: String): js.Promise[Any] = js.native
    def sendDocument(chat_id: Double, file: String, opt: Caption): js.Promise[Any] = js.native
    def sendDocument(chat_id: Double, file: Any): js.Promise[Any] = js.native
    def sendDocument(chat_id: Double, file: Any, opt: Caption): js.Promise[Any] = js.native
    def sendDocument(chat_id: Double, file: ReadableStream): js.Promise[Any] = js.native
    def sendDocument(chat_id: Double, file: ReadableStream, opt: Caption): js.Promise[Any] = js.native
    def sendDocument(chat_id: Double, file: Buffer): js.Promise[Any] = js.native
    def sendDocument(chat_id: Double, file: Buffer, opt: Caption): js.Promise[Any] = js.native
    
    def sendGame(chat_id: String, game_short_name: String): js.Promise[Any] = js.native
    def sendGame(chat_id: String, game_short_name: String, opt: NotificationReplyMarkup): js.Promise[Any] = js.native
    def sendGame(chat_id: Double, game_short_name: String): js.Promise[Any] = js.native
    def sendGame(chat_id: Double, game_short_name: String, opt: NotificationReplyMarkup): js.Promise[Any] = js.native
    
    def sendInvoice(chat_id: String, invoiceDetails: Currency): js.Promise[Any] = js.native
    def sendInvoice(chat_id: Double, invoiceDetails: Currency): js.Promise[Any] = js.native
    
    def sendLocation(chat_id: String, coords: js.Tuple2[Double, Double]): js.Promise[Any] = js.native
    def sendLocation(chat_id: String, coords: js.Tuple2[Double, Double], opt: NotificationReplyMarkup): js.Promise[Any] = js.native
    def sendLocation(chat_id: Double, coords: js.Tuple2[Double, Double]): js.Promise[Any] = js.native
    def sendLocation(chat_id: Double, coords: js.Tuple2[Double, Double], opt: NotificationReplyMarkup): js.Promise[Any] = js.native
    
    def sendMessage(chat_id: String, text: String): js.Promise[Any] = js.native
    def sendMessage(chat_id: String, text: String, opt: Notification): js.Promise[Any] = js.native
    def sendMessage(chat_id: Double, text: String): js.Promise[Any] = js.native
    def sendMessage(chat_id: Double, text: String, opt: Notification): js.Promise[Any] = js.native
    
    def sendPhoto(chat_id: String, file: String): js.Promise[Any] = js.native
    def sendPhoto(chat_id: String, file: String, opt: Caption): js.Promise[Any] = js.native
    def sendPhoto(chat_id: String, file: Any): js.Promise[Any] = js.native
    def sendPhoto(chat_id: String, file: Any, opt: Caption): js.Promise[Any] = js.native
    def sendPhoto(chat_id: String, file: ReadableStream): js.Promise[Any] = js.native
    def sendPhoto(chat_id: String, file: ReadableStream, opt: Caption): js.Promise[Any] = js.native
    def sendPhoto(chat_id: String, file: Buffer): js.Promise[Any] = js.native
    def sendPhoto(chat_id: String, file: Buffer, opt: Caption): js.Promise[Any] = js.native
    def sendPhoto(chat_id: Double, file: String): js.Promise[Any] = js.native
    def sendPhoto(chat_id: Double, file: String, opt: Caption): js.Promise[Any] = js.native
    def sendPhoto(chat_id: Double, file: Any): js.Promise[Any] = js.native
    def sendPhoto(chat_id: Double, file: Any, opt: Caption): js.Promise[Any] = js.native
    def sendPhoto(chat_id: Double, file: ReadableStream): js.Promise[Any] = js.native
    def sendPhoto(chat_id: Double, file: ReadableStream, opt: Caption): js.Promise[Any] = js.native
    def sendPhoto(chat_id: Double, file: Buffer): js.Promise[Any] = js.native
    def sendPhoto(chat_id: Double, file: Buffer, opt: Caption): js.Promise[Any] = js.native
    
    def sendSticker(chat_id: String, file: String): js.Promise[Any] = js.native
    def sendSticker(chat_id: String, file: String, opt: FileName): js.Promise[Any] = js.native
    def sendSticker(chat_id: String, file: Any): js.Promise[Any] = js.native
    def sendSticker(chat_id: String, file: Any, opt: FileName): js.Promise[Any] = js.native
    def sendSticker(chat_id: String, file: ReadableStream): js.Promise[Any] = js.native
    def sendSticker(chat_id: String, file: ReadableStream, opt: FileName): js.Promise[Any] = js.native
    def sendSticker(chat_id: String, file: Buffer): js.Promise[Any] = js.native
    def sendSticker(chat_id: String, file: Buffer, opt: FileName): js.Promise[Any] = js.native
    def sendSticker(chat_id: Double, file: String): js.Promise[Any] = js.native
    def sendSticker(chat_id: Double, file: String, opt: FileName): js.Promise[Any] = js.native
    def sendSticker(chat_id: Double, file: Any): js.Promise[Any] = js.native
    def sendSticker(chat_id: Double, file: Any, opt: FileName): js.Promise[Any] = js.native
    def sendSticker(chat_id: Double, file: ReadableStream): js.Promise[Any] = js.native
    def sendSticker(chat_id: Double, file: ReadableStream, opt: FileName): js.Promise[Any] = js.native
    def sendSticker(chat_id: Double, file: Buffer): js.Promise[Any] = js.native
    def sendSticker(chat_id: Double, file: Buffer, opt: FileName): js.Promise[Any] = js.native
    
    def sendVenue(chat_id: String, coords: js.Tuple2[Double, Double], title: String, address: String): js.Promise[Any] = js.native
    def sendVenue(
      chat_id: String,
      coords: js.Tuple2[Double, Double],
      title: String,
      address: String,
      opt: FoursquareId
    ): js.Promise[Any] = js.native
    def sendVenue(chat_id: Double, coords: js.Tuple2[Double, Double], title: String, address: String): js.Promise[Any] = js.native
    def sendVenue(
      chat_id: Double,
      coords: js.Tuple2[Double, Double],
      title: String,
      address: String,
      opt: FoursquareId
    ): js.Promise[Any] = js.native
    
    def sendVideo(chat_id: String, file: String): js.Promise[Any] = js.native
    def sendVideo(chat_id: String, file: String, opt: Height): js.Promise[Any] = js.native
    def sendVideo(chat_id: String, file: Any): js.Promise[Any] = js.native
    def sendVideo(chat_id: String, file: Any, opt: Height): js.Promise[Any] = js.native
    def sendVideo(chat_id: String, file: ReadableStream): js.Promise[Any] = js.native
    def sendVideo(chat_id: String, file: ReadableStream, opt: Height): js.Promise[Any] = js.native
    def sendVideo(chat_id: String, file: Buffer): js.Promise[Any] = js.native
    def sendVideo(chat_id: String, file: Buffer, opt: Height): js.Promise[Any] = js.native
    def sendVideo(chat_id: Double, file: String): js.Promise[Any] = js.native
    def sendVideo(chat_id: Double, file: String, opt: Height): js.Promise[Any] = js.native
    def sendVideo(chat_id: Double, file: Any): js.Promise[Any] = js.native
    def sendVideo(chat_id: Double, file: Any, opt: Height): js.Promise[Any] = js.native
    def sendVideo(chat_id: Double, file: ReadableStream): js.Promise[Any] = js.native
    def sendVideo(chat_id: Double, file: ReadableStream, opt: Height): js.Promise[Any] = js.native
    def sendVideo(chat_id: Double, file: Buffer): js.Promise[Any] = js.native
    def sendVideo(chat_id: Double, file: Buffer, opt: Height): js.Promise[Any] = js.native
    
    def sendVideoNote(chat_id: String, file: String): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: String, file: String, opt: ReplyMarkup): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: String, file: Any): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: String, file: Any, opt: ReplyMarkup): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: String, file: ReadableStream): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: String, file: ReadableStream, opt: ReplyMarkup): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: String, file: Buffer): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: String, file: Buffer, opt: ReplyMarkup): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: Double, file: String): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: Double, file: String, opt: ReplyMarkup): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: Double, file: Any): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: Double, file: Any, opt: ReplyMarkup): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: Double, file: ReadableStream): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: Double, file: ReadableStream, opt: ReplyMarkup): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: Double, file: Buffer): js.Promise[Any] = js.native
    def sendVideoNote(chat_id: Double, file: Buffer, opt: ReplyMarkup): js.Promise[Any] = js.native
    
    def sendVoice(chat_id: String, file: String): js.Promise[Any] = js.native
    def sendVoice(chat_id: String, file: String, opt: ReplyToMessage): js.Promise[Any] = js.native
    def sendVoice(chat_id: String, file: Any): js.Promise[Any] = js.native
    def sendVoice(chat_id: String, file: Any, opt: ReplyToMessage): js.Promise[Any] = js.native
    def sendVoice(chat_id: String, file: ReadableStream): js.Promise[Any] = js.native
    def sendVoice(chat_id: String, file: ReadableStream, opt: ReplyToMessage): js.Promise[Any] = js.native
    def sendVoice(chat_id: String, file: Buffer): js.Promise[Any] = js.native
    def sendVoice(chat_id: String, file: Buffer, opt: ReplyToMessage): js.Promise[Any] = js.native
    def sendVoice(chat_id: Double, file: String): js.Promise[Any] = js.native
    def sendVoice(chat_id: Double, file: String, opt: ReplyToMessage): js.Promise[Any] = js.native
    def sendVoice(chat_id: Double, file: Any): js.Promise[Any] = js.native
    def sendVoice(chat_id: Double, file: Any, opt: ReplyToMessage): js.Promise[Any] = js.native
    def sendVoice(chat_id: Double, file: ReadableStream): js.Promise[Any] = js.native
    def sendVoice(chat_id: Double, file: ReadableStream, opt: ReplyToMessage): js.Promise[Any] = js.native
    def sendVoice(chat_id: Double, file: Buffer): js.Promise[Any] = js.native
    def sendVoice(chat_id: Double, file: Buffer, opt: ReplyToMessage): js.Promise[Any] = js.native
    
    def setGameScore(user_id: Double, score: Double): js.Promise[Boolean | js.Error | Any] = js.native
    def setGameScore(user_id: Double, score: Double, opt: ChatId): js.Promise[Boolean | js.Error | Any] = js.native
    
    def setWebhook(url: String): js.Promise[Boolean] = js.native
    def setWebhook(url: String, certificate: Any): js.Promise[Boolean] = js.native
    def setWebhook(url: String, certificate: Any, allowed_updates: js.Array[String]): js.Promise[Boolean] = js.native
    def setWebhook(url: String, certificate: Any, allowed_updates: js.Array[String], max_connections: Double): js.Promise[Boolean] = js.native
    def setWebhook(url: String, certificate: Any, allowed_updates: Unit, max_connections: Double): js.Promise[Boolean] = js.native
    def setWebhook(url: String, certificate: Unit, allowed_updates: js.Array[String]): js.Promise[Boolean] = js.native
    def setWebhook(url: String, certificate: Unit, allowed_updates: js.Array[String], max_connections: Double): js.Promise[Boolean] = js.native
    def setWebhook(url: String, certificate: Unit, allowed_updates: Unit, max_connections: Double): js.Promise[Boolean] = js.native
    
    def start(args: Any*): Unit = js.native
    
    def stop(message: String): Unit = js.native
    
    def unbanChatMember(chat_id: String, user_id: Double): js.Promise[Boolean] = js.native
    def unbanChatMember(chat_id: Double, user_id: Double): js.Promise[Boolean] = js.native
    
    def use(module: module): Unit = js.native
  }
}
