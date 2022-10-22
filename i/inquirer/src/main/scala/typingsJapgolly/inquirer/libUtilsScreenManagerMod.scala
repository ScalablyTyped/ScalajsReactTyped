package typingsJapgolly.inquirer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsScreenManagerMod {
  
  /**
    * Provides the functionality to manage the content of a console-screen.
    */
  @JSImport("inquirer/lib/utils/screen-manager", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ScreenManager {
    /**
      * Initializes a new instance of the {@link ScreenManager `ScreenManager`} class.
      *
      * @param readLine
      * An object for reading from and writing to the console.
      */
    def this(readLine: Interface) = this()
    
    /**
      * Splits the {@link text `text`} into multiple lines with the specified maximum {@link width `width`}.
      *
      * @param text
      * The text to process.
      *
      * @param width
      * The max width of each line.
      */
    /* protected */ /* CompleteClass */
    override def breakLines(text: String, width: Double): js.Array[String] = js.native
    
    /**
      * Cleans all lines expect the first {@link extraLines `extraLines`}.
      *
      * @param extraLines
      * The number of lines at the begin to skip.
      */
    /* CompleteClass */
    override def clean(extraLines: Double): Unit = js.native
    
    /**
      * Releases all unmanaged resources.
      */
    /* CompleteClass */
    override def done(): Unit = js.native
    
    /**
      * Gets or sets the number of extra-lines below the prompt.
      */
    /* CompleteClass */
    var extraLinesUnderPrompt: Double = js.native
    
    /**
      * Adds line-breaks to the specified {@link text `text`} with the specified maximum {@link width `width`}.
      *
      * @param text
      * The text to process.
      *
      * @param width
      * The maximum width of each line.
      */
    /* protected */ /* CompleteClass */
    override def forceLineReturn(text: String, width: Double): String = js.native
    
    /**
      * Gets or sets the height of the screen.
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * Identifies the width of the screen.
      *
      * @returns
      * The width of the screen.
      */
    /* protected */ /* CompleteClass */
    override def normalizedCliWidth(): Double = js.native
    
    /**
      * Releases the cursor.
      */
    /* CompleteClass */
    override def releaseCursor(): Unit = js.native
    
    /**
      * Renders content to the screen.
      *
      * @param content
      * The content to render.
      *
      * @param bottomContent
      * The content to render to the bottom of the screen.
      */
    /* CompleteClass */
    override def render(content: String, bottomContent: String): Unit = js.native
    
    /**
      * Gets or sets an object for reading from and writing to the console.
      */
    /* CompleteClass */
    var rl: Interface = js.native
  }
  
  /**
    * Provides the functionality to manage the content of a console-screen.
    */
  trait ScreenManager extends StObject {
    
    /**
      * Splits the {@link text `text`} into multiple lines with the specified maximum {@link width `width`}.
      *
      * @param text
      * The text to process.
      *
      * @param width
      * The max width of each line.
      */
    /* protected */ def breakLines(text: String, width: Double): js.Array[String]
    
    /**
      * Cleans all lines expect the first {@link extraLines `extraLines`}.
      *
      * @param extraLines
      * The number of lines at the begin to skip.
      */
    def clean(extraLines: Double): Unit
    
    /**
      * Releases all unmanaged resources.
      */
    def done(): Unit
    
    /**
      * Gets or sets the number of extra-lines below the prompt.
      */
    var extraLinesUnderPrompt: Double
    
    /**
      * Adds line-breaks to the specified {@link text `text`} with the specified maximum {@link width `width`}.
      *
      * @param text
      * The text to process.
      *
      * @param width
      * The maximum width of each line.
      */
    /* protected */ def forceLineReturn(text: String, width: Double): String
    
    /**
      * Gets or sets the height of the screen.
      */
    var height: Double
    
    /**
      * Identifies the width of the screen.
      *
      * @returns
      * The width of the screen.
      */
    /* protected */ def normalizedCliWidth(): Double
    
    /**
      * Releases the cursor.
      */
    def releaseCursor(): Unit
    
    /**
      * Renders content to the screen.
      *
      * @param content
      * The content to render.
      *
      * @param bottomContent
      * The content to render to the bottom of the screen.
      */
    def render(content: String, bottomContent: String): Unit
    
    /**
      * Gets or sets an object for reading from and writing to the console.
      */
    var rl: Interface
  }
  object ScreenManager {
    
    inline def apply(
      breakLines: (String, Double) => js.Array[String],
      clean: Double => Callback,
      done: Callback,
      extraLinesUnderPrompt: Double,
      forceLineReturn: (String, Double) => String,
      height: Double,
      normalizedCliWidth: CallbackTo[Double],
      releaseCursor: Callback,
      render: (String, String) => Callback,
      rl: Interface
    ): ScreenManager = {
      val __obj = js.Dynamic.literal(breakLines = js.Any.fromFunction2(breakLines), clean = js.Any.fromFunction1((t0: Double) => clean(t0).runNow()), done = done.toJsFn, extraLinesUnderPrompt = extraLinesUnderPrompt.asInstanceOf[js.Any], forceLineReturn = js.Any.fromFunction2(forceLineReturn), height = height.asInstanceOf[js.Any], normalizedCliWidth = normalizedCliWidth.toJsFn, releaseCursor = releaseCursor.toJsFn, render = js.Any.fromFunction2((t0: String, t1: String) => (render(t0, t1)).runNow()), rl = rl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenManager]
    }
    
    extension [Self <: ScreenManager](x: Self) {
      
      inline def setBreakLines(value: (String, Double) => js.Array[String]): Self = StObject.set(x, "breakLines", js.Any.fromFunction2(value))
      
      inline def setClean(value: Double => Callback): Self = StObject.set(x, "clean", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setDone(value: Callback): Self = StObject.set(x, "done", value.toJsFn)
      
      inline def setExtraLinesUnderPrompt(value: Double): Self = StObject.set(x, "extraLinesUnderPrompt", value.asInstanceOf[js.Any])
      
      inline def setForceLineReturn(value: (String, Double) => String): Self = StObject.set(x, "forceLineReturn", js.Any.fromFunction2(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setNormalizedCliWidth(value: CallbackTo[Double]): Self = StObject.set(x, "normalizedCliWidth", value.toJsFn)
      
      inline def setReleaseCursor(value: Callback): Self = StObject.set(x, "releaseCursor", value.toJsFn)
      
      inline def setRender(value: (String, String) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setRl(value: Interface): Self = StObject.set(x, "rl", value.asInstanceOf[js.Any])
    }
  }
}
