package typingsJapgolly.beanstalkd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.beanstalkd.mod.BasicReader
import typingsJapgolly.beanstalkd.mod.BasicWriter
import typingsJapgolly.beanstalkd.mod.BeanstalkdCaller
import typingsJapgolly.beanstalkd.mod.BeanstalkdJobStats
import typingsJapgolly.beanstalkd.mod.BeanstalkdProtocol
import typingsJapgolly.beanstalkd.mod.BeanstalkdStats
import typingsJapgolly.beanstalkd.mod.BeanstalkdTubeStats
import typingsJapgolly.beanstalkd.mod.YamlReader
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<beanstalkd.beanstalkd.BeanstalkdClient> */
  trait RequiredBeanstalkdClient extends StObject {
    
    def _command(command: String, args: js.Array[Any], writer: BasicWriter, reader: BasicReader): js.Promise[Any]
    def _command(command: String, args: js.Array[Any], writer: BasicWriter, reader: YamlReader): js.Promise[Any]
    @JSName("_command")
    var _command_Original: js.Function4[
        /* command */ String, 
        /* args */ js.Array[Any], 
        /* writer */ BasicWriter, 
        /* reader */ BasicReader | YamlReader, 
        js.Promise[Any]
      ]
    
    def bury(id: Double, priority: Double): js.Promise[Unit]
    @JSName("bury")
    var bury_Original: js.Function2[/* id */ Double, /* priority */ Double, js.Promise[Unit]]
    
    var closed: Boolean
    
    def connect(): (js.Promise[this.type & BeanstalkdCaller]) & BeanstalkdCaller
    @JSName("connect")
    var connect_Original: js.Function0[(js.Promise[this.type & BeanstalkdCaller]) & BeanstalkdCaller]
    
    def delete(id: Double): js.Promise[Unit]
    @JSName("delete")
    var delete_Original: js.Function1[/* id */ Double, js.Promise[Unit]]
    
    def destroy(id: Double): js.Promise[Unit]
    @JSName("destroy")
    var destroy_Original: js.Function1[/* id */ Double, js.Promise[Unit]]
    
    var host: String
    
    def ignore(tube: String): js.Promise[Double]
    @JSName("ignore")
    var ignore_Original: js.Function1[/* tube */ String, js.Promise[Double]]
    
    def kick(maxToKick: Double): js.Promise[Double]
    
    def kickJob(id: Double): js.Promise[Unit]
    @JSName("kickJob")
    var kickJob_Original: js.Function1[/* id */ Double, js.Promise[Unit]]
    
    @JSName("kick")
    var kick_Original: js.Function1[/* maxToKick */ Double, js.Promise[Double]]
    
    def listTubeUsed(): js.Promise[String]
    @JSName("listTubeUsed")
    var listTubeUsed_Original: js.Function0[js.Promise[String]]
    
    def listTubeWatched(): js.Promise[js.Array[String]]
    @JSName("listTubeWatched")
    var listTubeWatched_Original: js.Function0[js.Promise[js.Array[String]]]
    
    def listTubes(): js.Promise[js.Array[String]]
    @JSName("listTubes")
    var listTubes_Original: js.Function0[js.Promise[js.Array[String]]]
    
    def on(event: String, listeners: (js.Function1[/* repeated */ Any, Unit])*): Unit
    @JSName("on")
    var on_Original: js.Function2[/* event */ String, /* repeated */ js.Function1[/* repeated */ Any, Unit], Unit]
    
    def pauseTube(tube: String, delay: Double): js.Promise[Unit]
    @JSName("pauseTube")
    var pauseTube_Original: js.Function2[/* tube */ String, /* delay */ Double, js.Promise[Unit]]
    
    def peek(id: Double): js.Promise[Buffer]
    
    def peekBuried(): js.Promise[js.Tuple2[String, Buffer]]
    @JSName("peekBuried")
    var peekBuried_Original: js.Function0[js.Promise[js.Tuple2[String, Buffer]]]
    
    def peekDelayed(): js.Promise[js.Tuple2[String, Buffer]]
    @JSName("peekDelayed")
    var peekDelayed_Original: js.Function0[js.Promise[js.Tuple2[String, Buffer]]]
    
    def peekReady(): js.Promise[js.Tuple2[String, Buffer]]
    @JSName("peekReady")
    var peekReady_Original: js.Function0[js.Promise[js.Tuple2[String, Buffer]]]
    
    @JSName("peek")
    var peek_Original: js.Function1[/* id */ Double, js.Promise[Buffer]]
    
    var port: Double
    
    var protocol: BeanstalkdProtocol
    
    def put(priority: Double, delay: Double, ttr: Double): js.Promise[String]
    def put(priority: Double, delay: Double, ttr: Double, payload: String): js.Promise[String]
    def put(priority: Double, delay: Double, ttr: Double, payload: Buffer): js.Promise[String]
    @JSName("put")
    var put_Original: js.Function4[
        /* priority */ Double, 
        /* delay */ Double, 
        /* ttr */ Double, 
        /* payload */ js.UndefOr[String | Buffer], 
        js.Promise[String]
      ]
    
    def quit(): js.Promise[Unit]
    @JSName("quit")
    var quit_Original: js.Function0[js.Promise[Unit]]
    
    def release(id: Double, priority: Double, delay: Double): js.Promise[Unit]
    @JSName("release")
    var release_Original: js.Function3[/* id */ Double, /* priority */ Double, /* delay */ Double, js.Promise[Unit]]
    
    def reserve(): js.Promise[js.Tuple2[String, Buffer]]
    
    def reserveWithTimeout(seconds: Double): js.Promise[Unit]
    @JSName("reserveWithTimeout")
    var reserveWithTimeout_Original: js.Function1[/* seconds */ Double, js.Promise[Unit]]
    
    @JSName("reserve")
    var reserve_Original: js.Function0[js.Promise[js.Tuple2[String, Buffer]]]
    
    def stats(): js.Promise[BeanstalkdStats]
    
    def statsJob(id: Double): js.Promise[BeanstalkdJobStats]
    @JSName("statsJob")
    var statsJob_Original: js.Function1[/* id */ Double, js.Promise[BeanstalkdJobStats]]
    
    def statsTube(tube: String): js.Promise[BeanstalkdTubeStats]
    @JSName("statsTube")
    var statsTube_Original: js.Function1[/* tube */ String, js.Promise[BeanstalkdTubeStats]]
    
    @JSName("stats")
    var stats_Original: js.Function0[js.Promise[BeanstalkdStats]]
    
    def touch(id: Double): js.Promise[Unit]
    @JSName("touch")
    var touch_Original: js.Function1[/* id */ Double, js.Promise[Unit]]
    
    def unref(): Unit
    @JSName("unref")
    var unref_Original: js.Function0[Unit]
    
    def use(tube: String): js.Promise[String]
    @JSName("use")
    var use_Original: js.Function1[/* tube */ String, js.Promise[String]]
    
    def watch(tube: String): js.Promise[Double]
    @JSName("watch")
    var watch_Original: js.Function1[/* tube */ String, js.Promise[Double]]
  }
  object RequiredBeanstalkdClient {
    
    inline def apply(
      _command: (/* command */ String, /* args */ js.Array[Any], /* writer */ BasicWriter, /* reader */ BasicReader | YamlReader) => js.Promise[Any],
      bury: (/* id */ Double, /* priority */ Double) => js.Promise[Unit],
      closed: Boolean,
      connect: CallbackTo[(js.Promise[RequiredBeanstalkdClient & BeanstalkdCaller]) & BeanstalkdCaller],
      delete: /* id */ Double => js.Promise[Unit],
      destroy: /* id */ Double => js.Promise[Unit],
      host: String,
      ignore: /* tube */ String => js.Promise[Double],
      kick: /* maxToKick */ Double => js.Promise[Double],
      kickJob: /* id */ Double => js.Promise[Unit],
      listTubeUsed: CallbackTo[js.Promise[String]],
      listTubeWatched: CallbackTo[js.Promise[js.Array[String]]],
      listTubes: CallbackTo[js.Promise[js.Array[String]]],
      on: (/* event */ String, /* repeated */ js.Function1[/* repeated */ Any, Unit]) => Callback,
      pauseTube: (/* tube */ String, /* delay */ Double) => js.Promise[Unit],
      peek: /* id */ Double => js.Promise[Buffer],
      peekBuried: CallbackTo[js.Promise[js.Tuple2[String, Buffer]]],
      peekDelayed: CallbackTo[js.Promise[js.Tuple2[String, Buffer]]],
      peekReady: CallbackTo[js.Promise[js.Tuple2[String, Buffer]]],
      port: Double,
      protocol: BeanstalkdProtocol,
      put: (/* priority */ Double, /* delay */ Double, /* ttr */ Double, /* payload */ js.UndefOr[String | Buffer]) => js.Promise[String],
      quit: CallbackTo[js.Promise[Unit]],
      release: (/* id */ Double, /* priority */ Double, /* delay */ Double) => js.Promise[Unit],
      reserve: CallbackTo[js.Promise[js.Tuple2[String, Buffer]]],
      reserveWithTimeout: /* seconds */ Double => js.Promise[Unit],
      stats: CallbackTo[js.Promise[BeanstalkdStats]],
      statsJob: /* id */ Double => js.Promise[BeanstalkdJobStats],
      statsTube: /* tube */ String => js.Promise[BeanstalkdTubeStats],
      touch: /* id */ Double => js.Promise[Unit],
      unref: Callback,
      use: /* tube */ String => js.Promise[String],
      watch: /* tube */ String => js.Promise[Double]
    ): RequiredBeanstalkdClient = {
      val __obj = js.Dynamic.literal(_command = js.Any.fromFunction4(_command), bury = js.Any.fromFunction2(bury), closed = closed.asInstanceOf[js.Any], connect = connect.toJsFn, delete = js.Any.fromFunction1(delete), destroy = js.Any.fromFunction1(destroy), host = host.asInstanceOf[js.Any], ignore = js.Any.fromFunction1(ignore), kick = js.Any.fromFunction1(kick), kickJob = js.Any.fromFunction1(kickJob), listTubeUsed = listTubeUsed.toJsFn, listTubeWatched = listTubeWatched.toJsFn, listTubes = listTubes.toJsFn, on = js.Any.fromFunction2((t0: /* event */ String, t1: /* repeated */ js.Function1[/* repeated */ Any, Unit]) => (on(t0, t1)).runNow()), pauseTube = js.Any.fromFunction2(pauseTube), peek = js.Any.fromFunction1(peek), peekBuried = peekBuried.toJsFn, peekDelayed = peekDelayed.toJsFn, peekReady = peekReady.toJsFn, port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], put = js.Any.fromFunction4(put), quit = quit.toJsFn, release = js.Any.fromFunction3(release), reserve = reserve.toJsFn, reserveWithTimeout = js.Any.fromFunction1(reserveWithTimeout), stats = stats.toJsFn, statsJob = js.Any.fromFunction1(statsJob), statsTube = js.Any.fromFunction1(statsTube), touch = js.Any.fromFunction1(touch), unref = unref.toJsFn, use = js.Any.fromFunction1(use), watch = js.Any.fromFunction1(watch))
      __obj.asInstanceOf[RequiredBeanstalkdClient]
    }
    
    extension [Self <: RequiredBeanstalkdClient](x: Self) {
      
      inline def setBury(value: (/* id */ Double, /* priority */ Double) => js.Promise[Unit]): Self = StObject.set(x, "bury", js.Any.fromFunction2(value))
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setConnect(value: CallbackTo[(js.Promise[RequiredBeanstalkdClient & BeanstalkdCaller]) & BeanstalkdCaller]): Self = StObject.set(x, "connect", value.toJsFn)
      
      inline def setDelete(value: /* id */ Double => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: /* id */ Double => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setIgnore(value: /* tube */ String => js.Promise[Double]): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setKick(value: /* maxToKick */ Double => js.Promise[Double]): Self = StObject.set(x, "kick", js.Any.fromFunction1(value))
      
      inline def setKickJob(value: /* id */ Double => js.Promise[Unit]): Self = StObject.set(x, "kickJob", js.Any.fromFunction1(value))
      
      inline def setListTubeUsed(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "listTubeUsed", value.toJsFn)
      
      inline def setListTubeWatched(value: CallbackTo[js.Promise[js.Array[String]]]): Self = StObject.set(x, "listTubeWatched", value.toJsFn)
      
      inline def setListTubes(value: CallbackTo[js.Promise[js.Array[String]]]): Self = StObject.set(x, "listTubes", value.toJsFn)
      
      inline def setOn(value: (/* event */ String, /* repeated */ js.Function1[/* repeated */ Any, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: /* event */ String, t1: /* repeated */ js.Function1[/* repeated */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setPauseTube(value: (/* tube */ String, /* delay */ Double) => js.Promise[Unit]): Self = StObject.set(x, "pauseTube", js.Any.fromFunction2(value))
      
      inline def setPeek(value: /* id */ Double => js.Promise[Buffer]): Self = StObject.set(x, "peek", js.Any.fromFunction1(value))
      
      inline def setPeekBuried(value: CallbackTo[js.Promise[js.Tuple2[String, Buffer]]]): Self = StObject.set(x, "peekBuried", value.toJsFn)
      
      inline def setPeekDelayed(value: CallbackTo[js.Promise[js.Tuple2[String, Buffer]]]): Self = StObject.set(x, "peekDelayed", value.toJsFn)
      
      inline def setPeekReady(value: CallbackTo[js.Promise[js.Tuple2[String, Buffer]]]): Self = StObject.set(x, "peekReady", value.toJsFn)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: BeanstalkdProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPut(
        value: (/* priority */ Double, /* delay */ Double, /* ttr */ Double, /* payload */ js.UndefOr[String | Buffer]) => js.Promise[String]
      ): Self = StObject.set(x, "put", js.Any.fromFunction4(value))
      
      inline def setQuit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "quit", value.toJsFn)
      
      inline def setRelease(value: (/* id */ Double, /* priority */ Double, /* delay */ Double) => js.Promise[Unit]): Self = StObject.set(x, "release", js.Any.fromFunction3(value))
      
      inline def setReserve(value: CallbackTo[js.Promise[js.Tuple2[String, Buffer]]]): Self = StObject.set(x, "reserve", value.toJsFn)
      
      inline def setReserveWithTimeout(value: /* seconds */ Double => js.Promise[Unit]): Self = StObject.set(x, "reserveWithTimeout", js.Any.fromFunction1(value))
      
      inline def setStats(value: CallbackTo[js.Promise[BeanstalkdStats]]): Self = StObject.set(x, "stats", value.toJsFn)
      
      inline def setStatsJob(value: /* id */ Double => js.Promise[BeanstalkdJobStats]): Self = StObject.set(x, "statsJob", js.Any.fromFunction1(value))
      
      inline def setStatsTube(value: /* tube */ String => js.Promise[BeanstalkdTubeStats]): Self = StObject.set(x, "statsTube", js.Any.fromFunction1(value))
      
      inline def setTouch(value: /* id */ Double => js.Promise[Unit]): Self = StObject.set(x, "touch", js.Any.fromFunction1(value))
      
      inline def setUnref(value: Callback): Self = StObject.set(x, "unref", value.toJsFn)
      
      inline def setUse(value: /* tube */ String => js.Promise[String]): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
      
      inline def setWatch(value: /* tube */ String => js.Promise[Double]): Self = StObject.set(x, "watch", js.Any.fromFunction1(value))
      
      inline def set_command(
        value: (/* command */ String, /* args */ js.Array[Any], /* writer */ BasicWriter, /* reader */ BasicReader | YamlReader) => js.Promise[Any]
      ): Self = StObject.set(x, "_command", js.Any.fromFunction4(value))
    }
  }
}
