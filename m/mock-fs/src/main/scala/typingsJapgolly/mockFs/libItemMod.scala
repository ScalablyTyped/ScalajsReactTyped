package typingsJapgolly.mockFs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libItemMod {
  
  /**
    * A filesystem item.
    */
  @JSImport("mock-fs/lib/item", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Item {
    
    /**  Returns whether the current user has execute permission. */
    /* CompleteClass */
    override def canExecute(): Boolean = js.native
    
    /** Returns whether the current user has read permission. */
    /* CompleteClass */
    override def canRead(): Boolean = js.native
    
    /** Returns whether the current user has write permission. */
    /* CompleteClass */
    override def canWrite(): Boolean = js.native
    
    /** Get access time. */
    /* CompleteClass */
    override def getATime(): js.Date = js.native
    
    /** Get birth time. */
    /* CompleteClass */
    override def getBirthtime(): js.Date = js.native
    
    /** Get change time. */
    /* CompleteClass */
    override def getCTime(): js.Date = js.native
    
    /** Get group id. */
    /* CompleteClass */
    override def getGid(): Double = js.native
    
    /** Get modification time. */
    /* CompleteClass */
    override def getMTime(): js.Date = js.native
    
    /** Get mode (permission only, e.g 0666). */
    /* CompleteClass */
    override def getMode(): Double = js.native
    
    /** Get item stats. */
    /* CompleteClass */
    override def getStats(): Stats = js.native
    
    /** Get user id. */
    /* CompleteClass */
    override def getUid(): Double = js.native
    
    /** Set access time. */
    /* CompleteClass */
    override def setATime(atime: js.Date): Unit = js.native
    
    /** Set birth time. */
    /* CompleteClass */
    override def setBirthtime(birthtime: js.Date): Unit = js.native
    
    /** Set change time. */
    /* CompleteClass */
    override def setCTime(ctime: js.Date): Unit = js.native
    
    /** Set group id. */
    /* CompleteClass */
    override def setGid(gid: Double): Unit = js.native
    
    /** Set modification time. */
    /* CompleteClass */
    override def setMTime(mtime: js.Date): Unit = js.native
    
    /** Set mode (permission only, e.g 0666). */
    /* CompleteClass */
    override def setMode(mode: Double): Unit = js.native
    
    /** Set user id. */
    /* CompleteClass */
    override def setUid(uid: Double): Unit = js.native
  }
  
  trait ExtendedStats
    extends StObject
       with Stats {
    
    var blocks: Double
    
    var mode: Double
    
    var size: Double
  }
  object ExtendedStats {
    
    inline def apply(
      atime: js.Date,
      birthtime: js.Date,
      blksize: Double,
      blocks: Double,
      ctime: js.Date,
      dev: Double,
      gid: Double,
      ino: Double,
      mode: Double,
      mtime: js.Date,
      nlink: Double,
      rdev: Double,
      size: Double,
      uid: Double
    ): ExtendedStats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedStats]
    }
    
    extension [Self <: ExtendedStats](x: Self) {
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A filesystem item.
    */
  trait Item extends StObject {
    
    /**  Returns whether the current user has execute permission. */
    def canExecute(): Boolean
    
    /** Returns whether the current user has read permission. */
    def canRead(): Boolean
    
    /** Returns whether the current user has write permission. */
    def canWrite(): Boolean
    
    /** Get access time. */
    def getATime(): js.Date
    
    /** Get birth time. */
    def getBirthtime(): js.Date
    
    /** Get change time. */
    def getCTime(): js.Date
    
    /** Get group id. */
    def getGid(): Double
    
    /** Get modification time. */
    def getMTime(): js.Date
    
    /** Get mode (permission only, e.g 0666). */
    def getMode(): Double
    
    /** Get item stats. */
    def getStats(): Stats
    
    /** Get user id. */
    def getUid(): Double
    
    /** Set access time. */
    def setATime(atime: js.Date): Unit
    
    /** Set birth time. */
    def setBirthtime(birthtime: js.Date): Unit
    
    /** Set change time. */
    def setCTime(ctime: js.Date): Unit
    
    /** Set group id. */
    def setGid(gid: Double): Unit
    
    /** Set modification time. */
    def setMTime(mtime: js.Date): Unit
    
    /** Set mode (permission only, e.g 0666). */
    def setMode(mode: Double): Unit
    
    /** Set user id. */
    def setUid(uid: Double): Unit
  }
  object Item {
    
    inline def apply(
      canExecute: CallbackTo[Boolean],
      canRead: CallbackTo[Boolean],
      canWrite: CallbackTo[Boolean],
      getATime: CallbackTo[js.Date],
      getBirthtime: CallbackTo[js.Date],
      getCTime: CallbackTo[js.Date],
      getGid: CallbackTo[Double],
      getMTime: CallbackTo[js.Date],
      getMode: CallbackTo[Double],
      getStats: CallbackTo[Stats],
      getUid: CallbackTo[Double],
      setATime: js.Date => Callback,
      setBirthtime: js.Date => Callback,
      setCTime: js.Date => Callback,
      setGid: Double => Callback,
      setMTime: js.Date => Callback,
      setMode: Double => Callback,
      setUid: Double => Callback
    ): Item = {
      val __obj = js.Dynamic.literal(canExecute = canExecute.toJsFn, canRead = canRead.toJsFn, canWrite = canWrite.toJsFn, getATime = getATime.toJsFn, getBirthtime = getBirthtime.toJsFn, getCTime = getCTime.toJsFn, getGid = getGid.toJsFn, getMTime = getMTime.toJsFn, getMode = getMode.toJsFn, getStats = getStats.toJsFn, getUid = getUid.toJsFn, setATime = js.Any.fromFunction1((t0: js.Date) => setATime(t0).runNow()), setBirthtime = js.Any.fromFunction1((t0: js.Date) => setBirthtime(t0).runNow()), setCTime = js.Any.fromFunction1((t0: js.Date) => setCTime(t0).runNow()), setGid = js.Any.fromFunction1((t0: Double) => setGid(t0).runNow()), setMTime = js.Any.fromFunction1((t0: js.Date) => setMTime(t0).runNow()), setMode = js.Any.fromFunction1((t0: Double) => setMode(t0).runNow()), setUid = js.Any.fromFunction1((t0: Double) => setUid(t0).runNow()))
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setCanExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "canExecute", value.toJsFn)
      
      inline def setCanRead(value: CallbackTo[Boolean]): Self = StObject.set(x, "canRead", value.toJsFn)
      
      inline def setCanWrite(value: CallbackTo[Boolean]): Self = StObject.set(x, "canWrite", value.toJsFn)
      
      inline def setGetATime(value: CallbackTo[js.Date]): Self = StObject.set(x, "getATime", value.toJsFn)
      
      inline def setGetBirthtime(value: CallbackTo[js.Date]): Self = StObject.set(x, "getBirthtime", value.toJsFn)
      
      inline def setGetCTime(value: CallbackTo[js.Date]): Self = StObject.set(x, "getCTime", value.toJsFn)
      
      inline def setGetGid(value: CallbackTo[Double]): Self = StObject.set(x, "getGid", value.toJsFn)
      
      inline def setGetMTime(value: CallbackTo[js.Date]): Self = StObject.set(x, "getMTime", value.toJsFn)
      
      inline def setGetMode(value: CallbackTo[Double]): Self = StObject.set(x, "getMode", value.toJsFn)
      
      inline def setGetStats(value: CallbackTo[Stats]): Self = StObject.set(x, "getStats", value.toJsFn)
      
      inline def setGetUid(value: CallbackTo[Double]): Self = StObject.set(x, "getUid", value.toJsFn)
      
      inline def setSetATime(value: js.Date => Callback): Self = StObject.set(x, "setATime", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
      
      inline def setSetBirthtime(value: js.Date => Callback): Self = StObject.set(x, "setBirthtime", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
      
      inline def setSetCTime(value: js.Date => Callback): Self = StObject.set(x, "setCTime", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
      
      inline def setSetGid(value: Double => Callback): Self = StObject.set(x, "setGid", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMTime(value: js.Date => Callback): Self = StObject.set(x, "setMTime", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
      
      inline def setSetMode(value: Double => Callback): Self = StObject.set(x, "setMode", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetUid(value: Double => Callback): Self = StObject.set(x, "setUid", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait Stats extends StObject {
    
    var atime: js.Date
    
    var birthtime: js.Date
    
    var blksize: Double
    
    var ctime: js.Date
    
    var dev: Double
    
    var gid: Double
    
    var ino: Double
    
    var mtime: js.Date
    
    var nlink: Double
    
    var rdev: Double
    
    var uid: Double
  }
  object Stats {
    
    inline def apply(
      atime: js.Date,
      birthtime: js.Date,
      blksize: Double,
      ctime: js.Date,
      dev: Double,
      gid: Double,
      ino: Double,
      mtime: js.Date,
      nlink: Double,
      rdev: Double,
      uid: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      inline def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      inline def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
