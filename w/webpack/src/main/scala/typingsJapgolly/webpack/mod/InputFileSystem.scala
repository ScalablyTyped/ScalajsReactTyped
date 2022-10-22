package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFileSystem extends StObject {
  
  var dirname: js.UndefOr[js.Function1[/* arg0 */ String, String]] = js.undefined
  
  var join: js.UndefOr[js.Function2[/* arg0 */ String, /* arg1 */ String, String]] = js.undefined
  
  var lstat: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var purge: js.UndefOr[js.Function1[/* arg0 */ js.UndefOr[String], Unit]] = js.undefined
  
  def readFile(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit
  
  var readJson: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function2[
        /* arg0 */ js.UndefOr[Null | js.Error | ErrnoException], 
        /* arg1 */ js.UndefOr[Any], 
        Unit
      ], 
      Unit
    ]
  ] = js.undefined
  
  def readdir(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Buffer | IDirent | String]], 
      Unit
    ]
  ): Unit
  
  def readlink(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit
  
  var realpath: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function2[
        /* arg0 */ js.UndefOr[Null | ErrnoException], 
        /* arg1 */ js.UndefOr[String | Buffer], 
        Unit
      ], 
      Unit
    ]
  ] = js.undefined
  
  var relative: js.UndefOr[js.Function2[/* arg0 */ String, /* arg1 */ String, String]] = js.undefined
  
  def stat(
    arg0: String,
    arg1: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit]
  ): Unit
}
object InputFileSystem {
  
  inline def apply(
    readFile: (String, js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]) => Callback,
    readdir: (String, js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Buffer | IDirent | String]], 
      Unit
    ]) => Callback,
    readlink: (String, js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]) => Callback,
    stat: (String, js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit]) => Callback
  ): InputFileSystem = {
    val __obj = js.Dynamic.literal(readFile = js.Any.fromFunction2((t0: String, t1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]) => (readFile(t0, t1)).runNow()), readdir = js.Any.fromFunction2((t0: String, t1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Buffer | IDirent | String]], 
      Unit
    ]) => (readdir(t0, t1)).runNow()), readlink = js.Any.fromFunction2((t0: String, t1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]) => (readlink(t0, t1)).runNow()), stat = js.Any.fromFunction2((t0: String, t1: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit]) => (stat(t0, t1)).runNow()))
    __obj.asInstanceOf[InputFileSystem]
  }
  
  extension [Self <: InputFileSystem](x: Self) {
    
    inline def setDirname(value: /* arg0 */ String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
    
    inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
    
    inline def setJoin(value: (/* arg0 */ String, /* arg1 */ String) => String): Self = StObject.set(x, "join", js.Any.fromFunction2(value))
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setLstat(
      value: (/* arg0 */ String, /* arg1 */ js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit]) => Callback
    ): Self = StObject.set(x, "lstat", js.Any.fromFunction2((t0: /* arg0 */ String, t1: /* arg1 */ js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
    
    inline def setPurge(value: /* arg0 */ js.UndefOr[String] => Callback): Self = StObject.set(x, "purge", js.Any.fromFunction1((t0: /* arg0 */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setPurgeUndefined: Self = StObject.set(x, "purge", js.undefined)
    
    inline def setReadFile(
      value: (String, js.Function2[
          /* arg0 */ js.UndefOr[Null | ErrnoException], 
          /* arg1 */ js.UndefOr[String | Buffer], 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "readFile", js.Any.fromFunction2((t0: String, t1: js.Function2[
          /* arg0 */ js.UndefOr[Null | ErrnoException], 
          /* arg1 */ js.UndefOr[String | Buffer], 
          Unit
        ]) => (value(t0, t1)).runNow()))
    
    inline def setReadJson(
      value: (/* arg0 */ String, /* arg1 */ js.Function2[
          /* arg0 */ js.UndefOr[Null | js.Error | ErrnoException], 
          /* arg1 */ js.UndefOr[Any], 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "readJson", js.Any.fromFunction2((t0: /* arg0 */ String, t1: /* arg1 */ js.Function2[
          /* arg0 */ js.UndefOr[Null | js.Error | ErrnoException], 
          /* arg1 */ js.UndefOr[Any], 
          Unit
        ]) => (value(t0, t1)).runNow()))
    
    inline def setReadJsonUndefined: Self = StObject.set(x, "readJson", js.undefined)
    
    inline def setReaddir(
      value: (String, js.Function2[
          /* arg0 */ js.UndefOr[Null | ErrnoException], 
          /* arg1 */ js.UndefOr[js.Array[Buffer | IDirent | String]], 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "readdir", js.Any.fromFunction2((t0: String, t1: js.Function2[
          /* arg0 */ js.UndefOr[Null | ErrnoException], 
          /* arg1 */ js.UndefOr[js.Array[Buffer | IDirent | String]], 
          Unit
        ]) => (value(t0, t1)).runNow()))
    
    inline def setReadlink(
      value: (String, js.Function2[
          /* arg0 */ js.UndefOr[Null | ErrnoException], 
          /* arg1 */ js.UndefOr[String | Buffer], 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "readlink", js.Any.fromFunction2((t0: String, t1: js.Function2[
          /* arg0 */ js.UndefOr[Null | ErrnoException], 
          /* arg1 */ js.UndefOr[String | Buffer], 
          Unit
        ]) => (value(t0, t1)).runNow()))
    
    inline def setRealpath(
      value: (/* arg0 */ String, /* arg1 */ js.Function2[
          /* arg0 */ js.UndefOr[Null | ErrnoException], 
          /* arg1 */ js.UndefOr[String | Buffer], 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "realpath", js.Any.fromFunction2((t0: /* arg0 */ String, t1: /* arg1 */ js.Function2[
          /* arg0 */ js.UndefOr[Null | ErrnoException], 
          /* arg1 */ js.UndefOr[String | Buffer], 
          Unit
        ]) => (value(t0, t1)).runNow()))
    
    inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    
    inline def setRelative(value: (/* arg0 */ String, /* arg1 */ String) => String): Self = StObject.set(x, "relative", js.Any.fromFunction2(value))
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setStat(
      value: (String, js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit]) => Callback
    ): Self = StObject.set(x, "stat", js.Any.fromFunction2((t0: String, t1: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit]) => (value(t0, t1)).runNow()))
  }
}
