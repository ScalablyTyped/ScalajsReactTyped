package typingsJapgolly.jestImageSnapshot

import typingsJapgolly.jestImageSnapshot.anon.Counter
import typingsJapgolly.jestImageSnapshot.anon.Message
import typingsJapgolly.jestImageSnapshot.anon.PartialOptions
import typingsJapgolly.jestImageSnapshot.jestImageSnapshotStrings.horizontal
import typingsJapgolly.jestImageSnapshot.jestImageSnapshotStrings.percent
import typingsJapgolly.jestImageSnapshot.jestImageSnapshotStrings.pixel
import typingsJapgolly.jestImageSnapshot.jestImageSnapshotStrings.pixelmatch
import typingsJapgolly.jestImageSnapshot.jestImageSnapshotStrings.ssim
import typingsJapgolly.jestImageSnapshot.jestImageSnapshotStrings.vertical
import typingsJapgolly.pixelmatch.mod.PixelmatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-image-snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureToMatchImageSnapshot(options: MatchImageSnapshotOptions): js.Function0[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureToMatchImageSnapshot")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Message]]
  
  inline def toMatchImageSnapshot(): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("toMatchImageSnapshot")().asInstanceOf[Message]
  inline def toMatchImageSnapshot(options: MatchImageSnapshotOptions): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("toMatchImageSnapshot")(options.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  inline def updateSnapshotState[TObject, TPartial](originalSnapshotState: TObject, partialSnapshotState: TPartial): TObject & TPartial = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSnapshotState")(originalSnapshotState.asInstanceOf[js.Any], partialSnapshotState.asInstanceOf[js.Any])).asInstanceOf[TObject & TPartial]
  
  trait MatchImageSnapshotOptions extends StObject {
    
    /**
      * If set to true, the build will not fail when the screenshots to compare have different sizes.
      * @default false
      */
    var allowSizeMismatch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Applies Gaussian Blur on compared images, accepts radius in pixels as value. Useful when you have noise after
      * scaling images per different resolutions on your target website, usually setting its value to 1-2 should be
      * enough to solve that problem.
      * @default 0.
      */
    var blur: js.UndefOr[Double] = js.undefined
    
    /**
      * The method by which images are compared.
      * `pixelmatch` does a pixel by pixel comparison, whereas `ssim` does a structural similarity comparison.
      * @default 'pixelmatch'
      */
    var comparisonMethod: js.UndefOr[pixelmatch | ssim] = js.undefined
    
    /**
      * Custom config passed to 'pixelmatch' or 'ssim'
      */
    var customDiffConfig: js.UndefOr[PixelmatchOptions | PartialOptions] = js.undefined
    
    /**
      * A custom absolute path of a directory to keep this diff in
      */
    var customDiffDir: js.UndefOr[String] = js.undefined
    
    /**
      * A custom absolute path of a directory to keep this received image in.
      */
    var customReceivedDir: js.UndefOr[String] = js.undefined
    
    /**
      * A custom name to give this snapshot. If not provided, one is computed automatically. When a function is provided
      * it is called with an object containing testPath, currentTestName, counter and defaultIdentifier as its first
      * argument. The function must return an identifier to use for the snapshot.
      */
    var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ Counter, String]) | String] = js.undefined
    
    /**
      * Custom snapshots directory.
      * Absolute path of a directory to keep the snapshot in.
      */
    var customSnapshotsDir: js.UndefOr[String] = js.undefined
    
    /**
      * Changes diff image layout direction.
      * @default 'horizontal'
      */
    var diffDirection: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * Will output base64 string of a diff image to console in case of failed tests (in addition to creating a diff image).
      * This string can be copy-pasted to a browser address string to preview the diff for a failed test.
      * @default false
      */
    var dumpDiffToConsole: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will output the image to the terminal using iTerm's Inline Images Protocol.
      * If the term is not compatible, it does the same thing as `dumpDiffToConsole`.
      * @default false
      */
    var dumpInlineDiffToConsole: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the threshold that would trigger a test failure based on the failureThresholdType selected. This is different
      * to the customDiffConfig.threshold above - the customDiffConfig.threshold is the per pixel failure threshold, whereas
      * this is the failure threshold for the entire comparison.
      * @default 0.
      */
    var failureThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the type of threshold that would trigger a failure.
      * @default 'pixel'.
      */
    var failureThresholdType: js.UndefOr[pixel | percent] = js.undefined
    
    /**
      * Removes coloring from the console output, useful if storing the results to a file.
      * @default false.
      */
    var noColors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Runs the diff in process without spawning a child process.
      * @default false.
      */
    var runInProcess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Store the received images separately from the composed diff images on failure.
      * This can be useful when updating baseline images from CI.
      * @default false
      */
    var storeReceivedOnFailure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Updates a snapshot even if it passed the threshold against the existing one.
      * @default false.
      */
    var updatePassedSnapshot: js.UndefOr[Boolean] = js.undefined
  }
  object MatchImageSnapshotOptions {
    
    inline def apply(): MatchImageSnapshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchImageSnapshotOptions]
    }
    
    extension [Self <: MatchImageSnapshotOptions](x: Self) {
      
      inline def setAllowSizeMismatch(value: Boolean): Self = StObject.set(x, "allowSizeMismatch", value.asInstanceOf[js.Any])
      
      inline def setAllowSizeMismatchUndefined: Self = StObject.set(x, "allowSizeMismatch", js.undefined)
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setComparisonMethod(value: pixelmatch | ssim): Self = StObject.set(x, "comparisonMethod", value.asInstanceOf[js.Any])
      
      inline def setComparisonMethodUndefined: Self = StObject.set(x, "comparisonMethod", js.undefined)
      
      inline def setCustomDiffConfig(value: PixelmatchOptions | PartialOptions): Self = StObject.set(x, "customDiffConfig", value.asInstanceOf[js.Any])
      
      inline def setCustomDiffConfigUndefined: Self = StObject.set(x, "customDiffConfig", js.undefined)
      
      inline def setCustomDiffDir(value: String): Self = StObject.set(x, "customDiffDir", value.asInstanceOf[js.Any])
      
      inline def setCustomDiffDirUndefined: Self = StObject.set(x, "customDiffDir", js.undefined)
      
      inline def setCustomReceivedDir(value: String): Self = StObject.set(x, "customReceivedDir", value.asInstanceOf[js.Any])
      
      inline def setCustomReceivedDirUndefined: Self = StObject.set(x, "customReceivedDir", js.undefined)
      
      inline def setCustomSnapshotIdentifier(value: (js.Function1[/* parameters */ Counter, String]) | String): Self = StObject.set(x, "customSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      inline def setCustomSnapshotIdentifierFunction1(value: /* parameters */ Counter => String): Self = StObject.set(x, "customSnapshotIdentifier", js.Any.fromFunction1(value))
      
      inline def setCustomSnapshotIdentifierUndefined: Self = StObject.set(x, "customSnapshotIdentifier", js.undefined)
      
      inline def setCustomSnapshotsDir(value: String): Self = StObject.set(x, "customSnapshotsDir", value.asInstanceOf[js.Any])
      
      inline def setCustomSnapshotsDirUndefined: Self = StObject.set(x, "customSnapshotsDir", js.undefined)
      
      inline def setDiffDirection(value: horizontal | vertical): Self = StObject.set(x, "diffDirection", value.asInstanceOf[js.Any])
      
      inline def setDiffDirectionUndefined: Self = StObject.set(x, "diffDirection", js.undefined)
      
      inline def setDumpDiffToConsole(value: Boolean): Self = StObject.set(x, "dumpDiffToConsole", value.asInstanceOf[js.Any])
      
      inline def setDumpDiffToConsoleUndefined: Self = StObject.set(x, "dumpDiffToConsole", js.undefined)
      
      inline def setDumpInlineDiffToConsole(value: Boolean): Self = StObject.set(x, "dumpInlineDiffToConsole", value.asInstanceOf[js.Any])
      
      inline def setDumpInlineDiffToConsoleUndefined: Self = StObject.set(x, "dumpInlineDiffToConsole", js.undefined)
      
      inline def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
      
      inline def setFailureThresholdType(value: pixel | percent): Self = StObject.set(x, "failureThresholdType", value.asInstanceOf[js.Any])
      
      inline def setFailureThresholdTypeUndefined: Self = StObject.set(x, "failureThresholdType", js.undefined)
      
      inline def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
      
      inline def setNoColors(value: Boolean): Self = StObject.set(x, "noColors", value.asInstanceOf[js.Any])
      
      inline def setNoColorsUndefined: Self = StObject.set(x, "noColors", js.undefined)
      
      inline def setRunInProcess(value: Boolean): Self = StObject.set(x, "runInProcess", value.asInstanceOf[js.Any])
      
      inline def setRunInProcessUndefined: Self = StObject.set(x, "runInProcess", js.undefined)
      
      inline def setStoreReceivedOnFailure(value: Boolean): Self = StObject.set(x, "storeReceivedOnFailure", value.asInstanceOf[js.Any])
      
      inline def setStoreReceivedOnFailureUndefined: Self = StObject.set(x, "storeReceivedOnFailure", js.undefined)
      
      inline def setUpdatePassedSnapshot(value: Boolean): Self = StObject.set(x, "updatePassedSnapshot", value.asInstanceOf[js.Any])
      
      inline def setUpdatePassedSnapshotUndefined: Self = StObject.set(x, "updatePassedSnapshot", js.undefined)
    }
  }
  
  object global {
    
    object jest {
      
      @js.native
      trait Matchers[R, T] extends StObject {
        
        def toMatchImageSnapshot(): R = js.native
        def toMatchImageSnapshot(options: MatchImageSnapshotOptions): R = js.native
      }
    }
  }
}
