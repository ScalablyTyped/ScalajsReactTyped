package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibUtilsLoggersMod.Logger
import typingsJapgolly.typedoc.distLibUtilsOptionsOptionsMod.Options
import typingsJapgolly.typedoc.distLibUtilsOptionsOptionsMod.OptionsReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsOptionsReadersTypedocMod {
  
  @JSImport("typedoc/dist/lib/utils/options/readers/typedoc", "TypeDocReader")
  @js.native
  open class TypeDocReader ()
    extends StObject
       with OptionsReader {
    
    /**
      * Search for the typedoc.js or typedoc.json file from the given path
      *
      * @param  path Path to the typedoc.(js|json) file. If path is a directory
      *   typedoc file will be attempted to be found at the root of this path
      * @param logger
      * @return the typedoc.(js|json) file path or undefined
      */
    /* private */ var findTypedocFile: Any = js.native
    
    /**
      * The name of this reader so that it may be removed by plugins without the plugin
      * accessing the instance performing the read. Multiple readers may have the same
      * name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Readers will be processed according to their priority.
      * A higher priority indicates that the reader should be called *later* so that
      * it can override options set by lower priority readers.
      *
      * Note that to preserve expected behavior, the argv reader must have both the lowest
      * priority so that it may set the location of config files used by other readers and
      * the highest priority so that it can override settings from lower priority readers.
      *
      * Note: In 0.23. `priority` will be renamed to `order`, with the same meaning
      */
    /* CompleteClass */
    var priority: Double = js.native
    
    /**
      * Read options from the reader's source and place them in the options parameter.
      * Options without a declared name may be treated as if they were declared with type
      * {@link ParameterType.Mixed}. Options which have been declared must be converted to the
      * correct type. As an alternative to doing this conversion in the reader,
      * the reader may use {@link Options.setValue}, which will correctly convert values.
      * @param options
      * @param compilerOptions
      * @param container the options container that provides declarations
      * @param logger
      */
    /* CompleteClass */
    override def read(container: Options, logger: Logger): Unit = js.native
    
    /**
      * Read the given options file + any extended files.
      * @param file
      * @param container
      * @param logger
      */
    /* private */ var readFile: Any = js.native
  }
}
