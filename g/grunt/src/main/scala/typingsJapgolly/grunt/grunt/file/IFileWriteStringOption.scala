package typingsJapgolly.grunt.grunt.file

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see IFileWriteOptions
  */
trait IFileWriteStringOption extends IFileWriteOptions {
  /**
    * The source file contents, source file path, and destination file path
    * are passed into this function, whose return value will be used as the
    * destination file's contents.  
    * If this function returns 'false', the file copy will be aborted.
    * @example
    ```ts
  const copyOptions: grunt.file.IFileWriteStringOption = {
    encoding: options.encoding,
    process: (contents: string, srcpath: string, destpath: string): string | boolean => {
    // some other code
    // return the content to be written or return false to cancel
    return contents;
    },
    noProcess: options.noProcess,
  };
    ```
    */
  var process: js.UndefOr[
    js.Function3[/* contents */ String, /* srcpath */ String, /* destpath */ String, String | Boolean]
  ] = js.undefined
}

object IFileWriteStringOption {
  @scala.inline
  def apply(
    encoding: String,
    noProcess: js.Any = null,
    process: (/* contents */ String, /* srcpath */ String, /* destpath */ String) => CallbackTo[String | Boolean] = null
  ): IFileWriteStringOption = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (noProcess != null) __obj.updateDynamic("noProcess")(noProcess.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(js.Any.fromFunction3((t0: /* contents */ java.lang.String, t1: /* srcpath */ java.lang.String, t2: /* destpath */ java.lang.String) => process(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IFileWriteStringOption]
  }
}

