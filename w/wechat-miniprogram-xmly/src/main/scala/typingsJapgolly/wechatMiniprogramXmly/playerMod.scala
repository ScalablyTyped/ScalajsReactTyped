package typingsJapgolly.wechatMiniprogramXmly

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playerMod {
  
  @JSImport("wechat-miniprogram-xmly/player", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with XMplayer
  
  @js.native
  trait Event extends StObject {
    
    /**
      * 校验是否在指定的事件集合中
      * @param name 事件名
      */
    /**
      * 触发（执行）自定义事件, 尽量避免手动触发播放器事件, 可能会影响到播放器内部运行
      * @param name 自定义事件名称
      * @param args 参数列表，传参示例；obj.emit('eventName', param1, param2, ...)
      * @returns 返回this，支持链式调用
      */
    def emit(
      name: PLAY_EVENT,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): this.type = js.native
    
    /**
      * 解除绑定的自定义事件
      *  1.funcInQueue参数缺省时，该自定义事件对应的整个回调队列都会被清空，否则仅移除事件的回调队列中的某一函数；
      *
      * @param name 自定义事件名称
      * @param funcInQueue 自定义事件对应的回调函数队列中某一函数
      * @returns 返回this，支持链式调用
      */
    def off(name: PLAY_EVENT): this.type = js.native
    def off(name: PLAY_EVENT, funcInQueue: js.Function1[/* args */ Any, Unit]): this.type = js.native
    
    /**
      * 绑定自定义事件
      * @param name 自定义事件名称
      * @param callback 回调函数，接收emit触发所有参数
      * @param ctx 回调函数的执行上下文
      * @returns 返回this，支持链式调用
      */
    def on(name: PLAY_EVENT, callback: js.Function1[/* args */ Any, Unit]): this.type = js.native
    
    /**
      * 绑定自定义事件（仅一次）
      * @param name 自定义事件名称
      * @param callback 回调函数，接收emit触发所有参数
      * @param ctx 回调函数的执行上下文
      * @returns 返回this，支持链式调用
      */
    def once(name: PLAY_EVENT, callback: js.Function1[/* args */ Any, Unit]): this.type = js.native
  }
  
  // 播放器异常
  /**
    * 播放相关事件
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.play
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.canplay
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.pause
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.resume
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.stop
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.end
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.next
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.prev
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.loading
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.timeupdate
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotsound
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplaylist
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplayState
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplayMode
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplaybackRate
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.error
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.errorDotaccessToken
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.soundDotneedPay
  */
  trait PLAY_EVENT extends StObject
  object PLAY_EVENT {
    
    inline def canplay: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.canplay = "canplay".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.canplay]
    
    inline def changeDotplayMode: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplayMode = "change.playMode".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplayMode]
    
    inline def changeDotplayState: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplayState = "change.playState".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplayState]
    
    inline def changeDotplaybackRate: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplaybackRate = "change.playbackRate".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplaybackRate]
    
    inline def changeDotplaylist: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplaylist = "change.playlist".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotplaylist]
    
    inline def changeDotsound: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotsound = "change.sound".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.changeDotsound]
    
    inline def end: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.end = "end".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.end]
    
    inline def error: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.error = "error".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.error]
    
    inline def errorDotaccessToken: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.errorDotaccessToken = "error.accessToken".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.errorDotaccessToken]
    
    inline def loading: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.loading = "loading".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.loading]
    
    inline def next: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.next = "next".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.next]
    
    inline def pause: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.pause = "pause".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.pause]
    
    inline def play: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.play = "play".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.play]
    
    inline def prev: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.prev = "prev".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.prev]
    
    inline def resume: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.resume = "resume".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.resume]
    
    inline def soundDotneedPay: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.soundDotneedPay = "sound.needPay".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.soundDotneedPay]
    
    inline def stop: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.stop = "stop".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.stop]
    
    inline def timeupdate: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.timeupdate = "timeupdate".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.timeupdate]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.order
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.loop
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.random
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.single
  */
  trait PLAY_MODE extends StObject
  object PLAY_MODE {
    
    inline def loop: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.loop = "loop".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.loop]
    
    inline def order: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.order = "order".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.order]
    
    inline def random: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.random = "random".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.random]
    
    inline def single: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.single = "single".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.single]
  }
  
  // 单个播放（播完即止）
  /**
    * 播放器状态
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.ready
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.loading
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.playing
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.paused
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.stoped
    - typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.error
  */
  trait PLAY_STATE extends StObject
  object PLAY_STATE {
    
    inline def error: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.error = "error".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.error]
    
    inline def loading: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.loading = "loading".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.loading]
    
    inline def paused: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.paused = "paused".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.paused]
    
    inline def playing: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.playing = "playing".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.playing]
    
    inline def ready: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.ready = "ready".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.ready]
    
    inline def stoped: typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.stoped = "stoped".asInstanceOf[typingsJapgolly.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.stoped]
  }
  
  /**
    * 播放列表
    */
  type PlayList = js.Array[Double]
  
  // 需要购买
  /**
    * 播放器通用声音, 可直接播放(用户传入的第三方声音、喜马声音解析后生成)
    */
  trait Sound extends StObject {
    
    // 音频标题, 原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值。
    var coverImgUrl: js.UndefOr[String] = js.undefined
    
    // 歌手名
    var duration: js.UndefOr[Double] = js.undefined
    
    // 音频背景图
    var epname: js.UndefOr[String] = js.undefined
    
    var id: Double
    
    // 专辑名称
    var singer: js.UndefOr[String] = js.undefined
    
    // 音频 id
    var src: String
    
    // 播放地址（目前支持 m4a, aac, mp3, wav 格式）
    var title: js.UndefOr[String] = js.undefined
  }
  object Sound {
    
    inline def apply(id: Double, src: String): Sound = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sound]
    }
    
    extension [Self <: Sound](x: Self) {
      
      inline def setCoverImgUrl(value: String): Self = StObject.set(x, "coverImgUrl", value.asInstanceOf[js.Any])
      
      inline def setCoverImgUrlUndefined: Self = StObject.set(x, "coverImgUrl", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEpname(value: String): Self = StObject.set(x, "epname", value.asInstanceOf[js.Any])
      
      inline def setEpnameUndefined: Self = StObject.set(x, "epname", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSinger(value: String): Self = StObject.set(x, "singer", value.asInstanceOf[js.Any])
      
      inline def setSingerUndefined: Self = StObject.set(x, "singer", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * 声音集合
    */
  type Sounds[T] = NumberDictionary[T]
  
  @js.native
  trait XMplayer
    extends StObject
       with Event {
    
    /**
      * 销毁播放器
      */
    def destroy(): Unit = js.native
    
    /**
      * 获取当前音频已缓冲的时间
      */
    def getBuffered(): Double = js.native
    
    /**
      * 获取当前播放声音在播放列表中的索引
      */
    def getCurrentIndex(): Double = js.native
    
    /**
      * 获取当前音频的播放位置，单位：秒
      */
    def getCurrentTime(): Double = js.native
    
    /**
      * 获取正在播放音频的总播放时长（单位：秒）
      *  - 只有在有合法 src 时返回
      */
    def getDuration(): Double = js.native
    
    /**
      * 获取播放模式
      */
    def getPlayMode(): PLAY_MODE = js.native
    
    /**
      * 获取当前播放器状态
      */
    def getPlayState(): PLAY_STATE = js.native
    
    /**
      * 获取当前播放速度
      */
    def getPlaybackRate(): Double = js.native
    
    /**
      * 获取播放列表
      * @param isCurrent 是否返回当前播放列表，即：是否与播放模式有关
      *  - true：与播放模式有关，例如：随机播放模式，当前的播放列表会乱序，与原始设置的列表数组比较，元素顺序已改变；
      *  - false：与播放模式无关，即：初始化时或setPlaylist()时设置的 playlist；
      */
    def getPlaylist(): PlayList = js.native
    def getPlaylist(isCurrent: Boolean): PlayList = js.native
    
    /**
      * 获取当前 sound
      *  - 当前播放器加载的，未必是正在播放
      */
    def getSound(): js.UndefOr[Sound] = js.native
    
    /**
      * 获取 sounds
      */
    def getSounds(): Sounds[Sound] = js.native
    
    /**
      * 是否在广告播放中
      */
    def isAdvertising(): Boolean = js.native
    
    /**
      * 下一个/下一曲
      * （自动切到第一个）
      */
    def next(): Unit = js.native
    
    /**
      * 暂停
      */
    def pause(): Unit = js.native
    
    /**
      * 播放
      * @param id 声音 ID | 空
      */
    def play(): js.Promise[Unit] = js.native
    def play(option: Double): js.Promise[Unit] = js.native
    
    /**
      * 按播放列表索引播放
      * @param index 播放列表中的索引
      */
    def playByIndex(index: Double): Unit = js.native
    
    /**
      * 预加载声音
      * @param  id 声音id
      */
    def preloadSound(id: Double): js.Promise[Unit] = js.native
    
    /**
      * 上一个/上一曲
      * （自动切到最后一个）
      */
    def prev(): Unit = js.native
    
    /**
      * 断点续播
      * 小程序会直接播放，如果只需要恢复数据可手动暂停
      */
    def recover(): Unit = js.native
    
    /**
      * 续播之前播放的音频
      */
    /* protected */ def resume(): Unit = js.native
    
    /**
      * 跳转到指定播放位置
      *  - 超过总时长会触发 end 事件，随后自动切换播放下一首
      *
      * @param position 指定的播放位置，单位：秒
      */
    def seek(position: Double): Unit = js.native
    
    /**
      * 后退，向前（向开始位置）拖动
      * @param  dif 间距，正数（单位：秒）
      */
    def seekBack(): Unit = js.native
    def seekBack(dif: Double): Unit = js.native
    
    /**
      * 前进，向后（向结束位置）拖动
      * @param  dif 间距，正数（单位：秒）
      */
    def seekForward(): Unit = js.native
    def seekForward(dif: Double): Unit = js.native
    
    /**
      * 设置自动跳过
      *
      * @param autoskip
      */
    def setAutoskip(autoskip: Boolean): Unit = js.native
    
    /**
      * 设置播放模式
      * @param playMode 播放模式
      */
    def setPlayMode(playMode: PLAY_MODE): Unit = js.native
    
    /**
      * 设置播放速度
      *  - 基础库 2.11.0 开始支持
      *  - Android 需要 6 及以上版本
      *  - 切换上一个、下一个音频，倍速会恢复正常的速度
      *
      * @param playbackRate 播放速度（0.5、1、2）
      */
    def setPlaybackRate(playbackRate: Double): Unit = js.native
    
    /**
      * 设置播放列表
      * @param playlist 播放列表
      */
    def setPlaylist(): Unit = js.native
    def setPlaylist(playlist: PlayList): Unit = js.native
    
    /**
      * 设置 sounds
      * @param sounds 声音集合
      */
    def setSounds(sounds: Sounds[Sound]): Unit = js.native
    
    /**
      * 停止，重新播放会从头播。
      */
    def stop(): Unit = js.native
  }
}
